_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistEra.java
    @Override

    /**
     * Gets the numeric era {@code int} value.
     * <p>
     * The era BEFORE_BE has the value 0, while the era BE has the value 1.
     *
     * @return the era value, from 0 (BEFORE_BE) to 1 (BE)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistEra.java
    public static ThaiBuddhistEra of(int thaiBuddhistEra) {

    /**
     * Obtains an instance of {@code ThaiBuddhistEra} from an {@code int} value.
     * <p>
     * {@code ThaiBuddhistEra} is an enum representing the Thai Buddhist eras of BEFORE_BE/BE.
     * This factory allows the enum to be obtained from the {@code int} value.
     *
     * @param thaiBuddhistEra  the era to represent, from 0 to 1
     * @return the BuddhistEra singleton, never null
     * @throws DateTimeException if the era is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistEra.java
    BEFORE_BE,

    /**
     * The singleton instance for the era before the current one, 'Before Buddhist Era',
     * which has the numeric value 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistEra.java
public enum ThaiBuddhistEra implements Era {

/**
 * An era in the Thai Buddhist calendar system.
 * <p>
 * The Thai Buddhist calendar system has two eras.
 * The current era, for years from 1 onwards, is known as the 'Buddhist' era.
 * All previous years, zero or earlier in the proleptic count or one and greater
 * in the year-of-era count, are part of the 'Before Buddhist' era.
 *
 * <table summary="Buddhist years and eras" cellpadding="2" cellspacing="3" border="0" >
 * <thead>
 * <tr class="tableSubHeadingColor">
 * <th class="colFirst" align="left">year-of-era</th>
 * <th class="colFirst" align="left">era</th>
 * <th class="colFirst" align="left">proleptic-year</th>
 * <th class="colLast" align="left">ISO proleptic-year</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr class="rowColor">
 * <td>2</td><td>BE</td><td>2</td><td>-542</td>
 * </tr>
 * <tr class="altColor">
 * <td>1</td><td>BE</td><td>1</td><td>-543</td>
 * </tr>
 * <tr class="rowColor">
 * <td>1</td><td>BEFORE_BE</td><td>0</td><td>-544</td>
 * </tr>
 * <tr class="altColor">
 * <td>2</td><td>BEFORE_BE</td><td>-1</td><td>-545</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * <b>Do not use {@code ordinal()} to obtain the numeric representation of {@code ThaiBuddhistEra}.
 * Use {@code getValue()} instead.</b>
 *
 * @implSpec
 * This is an immutable and thread-safe enum.
 *
 * @since 1.8
 */
