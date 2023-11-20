import java.util.Objects;

/**
 * Defines the characteristics of an address within the US.
 */
public class Address {

    /**
     * State enumerations
     */
    public enum USState {
        ALABAMA("AL"),
        ALASKA("AK"),
        ARIZONA("AZ"),
        ARKANSAS("AR"),
        CALIFORNIA("CA"),
        COLORADO("CO"),
        CONNECTICUT("CT"),
        DELAWARE("DE"),
        FLORIDA("FL"),
        GEORGIA("GA"),
        HAWAII("HI"),
        IDAHO("ID"),
        ILLINOIS("IL"),
        INDIANA("IN"),
        IOWA("IA"),
        KANSAS("KS"),
        KENTUCKY("KY"),
        LOUISIANA("LA"),
        MAINE("ME"),
        MARYLAND("MD"),
        MASSACHUSETTS("MA"),
        MICHIGAN("MI"),
        MINNESOTA("MN"),
        MISSISSIPPI("MS"),
        MISSOURI("MO"),
        MONTANA("MT"),
        NEBRASKA("NE"),
        NEVADA("NV"),
        NEW_HAMPSHIRE("NH"),
        NEW_JERSEY("NJ"),
        NEW_MEXICO("NM"),
        NEW_YORK("NY"),
        NORTH_CAROLINA("NC"),
        NORTH_DAKOTA("ND"),
        OHIO("OH"),
        OKLAHOMA("OK"),
        OREGON("OR"),
        PENNSYLVANIA("PA"),
        RHODE_ISLAND("RI"),
        SOUTH_CAROLINA("SC"),
        SOUTH_DAKOTA("SD"),
        TENNESSEE("TN"),
        TEXAS("TX"),
        UTAH("UT"),
        VERMONT("VT"),
        VIRGINIA("VA"),
        WASHINGTON("WA"),
        WEST_VIRGINIA("WV"),
        WISCONSIN("WI"),
        WYOMING("WY");

        /**
         * Abbreviation for a state
         */
        private final String abbreviation;

        /**
         * Facilitates have an abbreviation associated with a state enum value
         *
         * @param abbreviation Abbreviation for a state
         */
        USState(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        /**
         * Returns the abbreviation for a state
         */
        public String getAbbreviation() {
            return abbreviation;
        }
    }

    /**
     * Street address (e.g. 12345 Sample Street)
     */
    private String streetAddress;

    /**
     * City portion of an address
     */
    private String city;

    /**
     * Enumerated value for a state
     */
    private USState state;

    /**
     * Zip code portion of an address.
     * Note: this has a data type of String for flexibility
     * (i.e. it supports a zip like 90210 or 90210-1234, plus
     * there aren't any plans for arithmetic operations on the zip code).
     */
    private String zipCode;

    /**
     * Creates a fully initialized address instance using the given data
     *
     * @param streetAddress  Street address (e.g. 12345 Sample Street)
     * @param city           City portion of an address
     * @param state          Enumerated value for a state
     * @param zipCode        Zip code portion of an address
     */
    public Address(String streetAddress, String city, USState state, String zipCode) {

        // Null check the arguments that could possibly be null
        if (streetAddress == null) {
            throw new IllegalArgumentException("Cannot create an address with a null street address field");
        }

        if (city == null) {
            throw new IllegalArgumentException("Cannot create an address with a null city field");
        }

        if (zipCode == null) {
            throw new IllegalArgumentException("Cannot create an address with a null zip code field");
        }

        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Returns the street address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Returns the city portion of an address
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the state portion of an address
     */
    public USState getState() {
        return state;
    }

    /**
     * Returns the zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Returns a string representation of an address instance
     */
    @Override
    public String toString() {

        return streetAddress + "\n" +
                city + ", " + state.getAbbreviation() + " " + zipCode;
    }

    /**
     * Determines if this instance of an address equals the other address instance
     * @param o Other address instance
     * @return True if this address instance equals the other address instance, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetAddress, address.streetAddress) &&
                Objects.equals(city, address.city) &&
                state == address.state &&
                Objects.equals(zipCode, address.zipCode);
    }

    /**
     * Computes and returns the hash code for this address instance.
     */
    @Override
    public int hashCode() {
        return Objects.hash(streetAddress, city, state, zipCode);
    }
}
