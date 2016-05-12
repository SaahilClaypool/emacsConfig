_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952L)),

        /**
         * Unit that represents the concept of a week-based-year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    private static enum Unit implements TemporalUnit {

    /**
     * Implementation of the unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    private static enum Field implements TemporalField {

    /**
     * Implementation of the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    private IsoFields() {

    /**
     * Restricted constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    public static final TemporalUnit WEEK_BASED_YEARS = Unit.WEEK_BASED_YEARS;

    /**
     * The unit that represents week-based-years for the purpose of addition and subtraction.
     * <p>
     * This allows a number of week-based-years to be added to, or subtracted from, a date.
     * The unit is equal to either 52 or 53 weeks.
     * The estimated duration of a week-based-year is the same as that of a standard ISO
     * year at {@code 365.2425 Days}.
     * <p>
     * The rules for addition add the number of week-based-years to the existing value
     * for the week-based-year field. If the resulting week-based-year only has 52 weeks,
     * then the date will be in week 1 of the following week-based-year.
     * <p>
     * This unit is an immutable and thread-safe singleton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    public static final TemporalField WEEK_OF_WEEK_BASED_YEAR = Field.WEEK_OF_WEEK_BASED_YEAR;

    /**
     * The field that represents the week-of-week-based-year.
     * <p>
     * This field allows the week of the week-based-year value to be queried and set.
     * The week-of-week-based-year has values from 1 to 52, or 53 if the
     * week-based-year has 53 weeks.
     * <p>
     * In the resolving phase of parsing, a date can be created from a
     * week-based-year, week-of-week-based-year and day-of-week.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all three fields are
     * validated against their range of valid values. The week-of-week-based-year
     * field is validated from 1 to 52 or 53 depending on the week-based-year.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all three fields are
     * validated against their range of valid values. The week-of-week-based-year
     * field is validated between 1 and 53, ignoring the week-based-year.
     * If the week-of-week-based-year is 53, but the week-based-year only has
     * 52 weeks, then the resulting date is in week 1 of the following week-based-year.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, only the week-based-year
     * is validated against the range of valid values. If the day-of-week is outside
     * the range 1 to 7, then the resulting date is adjusted by a suitable number of
     * weeks to reduce the day-of-week to the range 1 to 7. If the week-of-week-based-year
     * value is outside the range 1 to 52, then any excess weeks are added or subtracted
     * from the resulting date.
     * <p>
     * This unit is an immutable and thread-safe singleton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
    public static final TemporalField DAY_OF_QUARTER = Field.DAY_OF_QUARTER;

    /**
     * The field that represents the day-of-quarter.
     * <p>
     * This field allows the day-of-quarter value to be queried and set.
     * The day-of-quarter has values from 1 to 90 in Q1 of a standard year, from 1 to 91
     * in Q1 of a leap year, from 1 to 91 in Q2 and from 1 to 92 in Q3 and Q4.
     * <p>
     * The day-of-quarter can only be calculated if the day-of-year, month-of-year and year
     * are available.
     * <p>
     * When setting this field, the value is allowed to be partially lenient, taking any
     * value from 1 to 92. If the quarter has less than 92 days, then day 92, and
     * potentially day 91, is in the following quarter.
     * <p>
     * In the resolving phase of parsing, a date can be created from a year,
     * quarter-of-year and day-of-quarter.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all three fields are
     * validated against their range of valid values. The day-of-quarter field
     * is validated from 1 to 90, 91 or 92 depending on the year and quarter.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all three fields are
     * validated against their range of valid values. The day-of-quarter field is
     * validated between 1 and 92, ignoring the actual range based on the year and quarter.
     * If the day-of-quarter exceeds the actual range by one day, then the resulting date
     * is one day later. If the day-of-quarter exceeds the actual range by two days,
     * then the resulting date is two days later.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, only the year is validated
     * against the range of valid values. The resulting date is calculated equivalent to
     * the following three stage approach. First, create a date on the first of January
     * in the requested year. Then take the quarter-of-year, subtract one, and add the
     * amount in quarters to the date. Finally, take the day-of-quarter, subtract one,
     * and add the amount in days to the date.
     * <p>
     * This unit is an immutable and thread-safe singleton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/IsoFields.java
public final class IsoFields {

/**
 * Fields and units specific to the ISO-8601 calendar system,
 * including quarter-of-year and week-based-year.
 * <p>
 * This class defines fields and units that are specific to the ISO calendar system.
 *
 * <h3>Quarter of year</h3>
 * The ISO-8601 standard is based on the standard civic 12 month year.
 * This is commonly divided into four quarters, often abbreviated as Q1, Q2, Q3 and Q4.
 * <p>
 * January, February and March are in Q1.
 * April, May and June are in Q2.
 * July, August and September are in Q3.
 * October, November and December are in Q4.
 * <p>
 * The complete date is expressed using three fields:
 * <ul>
 * <li>{@link #DAY_OF_QUARTER DAY_OF_QUARTER} - the day within the quarter, from 1 to 90, 91 or 92
 * <li>{@link #QUARTER_OF_YEAR QUARTER_OF_YEAR} - the week within the week-based-year
 * <li>{@link ChronoField#YEAR YEAR} - the standard ISO year
 * </ul>
 *
 * <h3>Week based years</h3>
 * The ISO-8601 standard was originally intended as a data interchange format,
 * defining a string format for dates and times. However, it also defines an
 * alternate way of expressing the date, based on the concept of week-based-year.
 * <p>
 * The date is expressed using three fields:
 * <ul>
 * <li>{@link ChronoField#DAY_OF_WEEK DAY_OF_WEEK} - the standard field defining the
 *  day-of-week from Monday (1) to Sunday (7)
 * <li>{@link #WEEK_OF_WEEK_BASED_YEAR} - the week within the week-based-year
 * <li>{@link #WEEK_BASED_YEAR WEEK_BASED_YEAR} - the week-based-year
 * </ul>
 * The week-based-year itself is defined relative to the standard ISO proleptic year.
 * It differs from the standard year in that it always starts on a Monday.
 * <p>
 * The first week of a week-based-year is the first Monday-based week of the standard
 * ISO year that has at least 4 days in the new year.
 * <ul>
 * <li>If January 1st is Monday then week 1 starts on January 1st
 * <li>If January 1st is Tuesday then week 1 starts on December 31st of the previous standard year
 * <li>If January 1st is Wednesday then week 1 starts on December 30th of the previous standard year
 * <li>If January 1st is Thursday then week 1 starts on December 29th of the previous standard year
 * <li>If January 1st is Friday then week 1 starts on January 4th
 * <li>If January 1st is Saturday then week 1 starts on January 3rd
 * <li>If January 1st is Sunday then week 1 starts on January 2nd
 * </ul>
 * There are 52 weeks in most week-based years, however on occasion there are 53 weeks.
 * <p>
 * For example:
 *
 * <table cellpadding="0" cellspacing="3" border="0" style="text-align: left; width: 50%;">
 * <caption>Examples of Week based Years</caption>
 * <tr><th>Date</th><th>Day-of-week</th><th>Field values</th></tr>
 * <tr><th>2008-12-28</th><td>Sunday</td><td>Week 52 of week-based-year 2008</td></tr>
 * <tr><th>2008-12-29</th><td>Monday</td><td>Week 1 of week-based-year 2009</td></tr>
 * <tr><th>2008-12-31</th><td>Wednesday</td><td>Week 1 of week-based-year 2009</td></tr>
 * <tr><th>2009-01-01</th><td>Thursday</td><td>Week 1 of week-based-year 2009</td></tr>
 * <tr><th>2009-01-04</th><td>Sunday</td><td>Week 1 of week-based-year 2009</td></tr>
 * <tr><th>2009-01-05</th><td>Monday</td><td>Week 2 of week-based-year 2009</td></tr>
 * </table>
 *
 * @implSpec
 * <p>
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
