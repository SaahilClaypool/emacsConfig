_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    public int checkValidIntValue(long value) {

    /**
     * Checks that the specified value is valid and fits in an {@code int}.
     * <p>
     * This validates that the value is within the outer range of valid values
     * returned by {@link #range()}.
     * It also checks that all valid values are within the bounds of an {@code int}.
     * <p>
     * This method checks against the range of the field in the ISO-8601 calendar system.
     * This range may be incorrect for other calendar systems.
     * Use {@link Chronology#range(ChronoField)} to access the correct range
     * for a different calendar system.
     *
     * @param value  the value to check
     * @return the value that was passed in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    public long checkValidValue(long value) {

    /**
     * Checks that the specified value is valid for this field.
     * <p>
     * This validates that the value is within the outer range of valid values
     * returned by {@link #range()}.
     * <p>
     * This method checks against the range of the field in the ISO-8601 calendar system.
     * This range may be incorrect for other calendar systems.
     * Use {@link Chronology#range(ChronoField)} to access the correct range
     * for a different calendar system.
     *
     * @param value  the value to check
     * @return the value that was passed in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    @Override

    /**
     * Checks if this field represents a component of a time.
     * <p>
     * Fields from nano-of-second to am-pm-of-day are time-based.
     *
     * @return true if it is a component of a time
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    @Override

    /**
     * Checks if this field represents a component of a date.
     * <p>
     * Fields from day-of-week to era are date-based.
     *
     * @return true if it is a component of a date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    @Override

    /**
     * Gets the range of valid values for the field.
     * <p>
     * All fields can be expressed as a {@code long} integer.
     * This method returns an object that describes the valid range for that value.
     * <p>
     * This method returns the range of the field in the ISO-8601 calendar system.
     * This range may be incorrect for other calendar systems.
     * Use {@link Chronology#range(ChronoField)} to access the correct range
     * for a different calendar system.
     * <p>
     * Note that the result only describes the minimum and maximum valid values
     * and it is important not to read too much into them. For example, there
     * could be values within the range that are invalid for the field.
     *
     * @return the range of valid values for the field, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    INSTANT_SECONDS("InstantSeconds", SECONDS, FOREVER, ValueRange.of(Long.MIN_VALUE, Long.MAX_VALUE)),

    /**
     * The instant epoch-seconds.
     * <p>
     * This represents the concept of the sequential count of seconds where
     * 1970-01-01T00:00Z (ISO) is zero.
     * This field may be used with {@link #NANO_OF_SECOND} to represent the fraction of the second.
     * <p>
     * An {@link Instant} represents an instantaneous point on the time-line.
     * On their own, an instant has insufficient information to allow a local date-time to be obtained.
     * Only when paired with an offset or time-zone can the local date or time be calculated.
     * <p>
     * This field is strictly defined to have the same meaning in all calendar systems.
     * This is necessary to ensure interoperation between calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    YEAR("Year", YEARS, FOREVER, ValueRange.of(Year.MIN_VALUE, Year.MAX_VALUE), "year"),

    /**
     * The proleptic year, such as 2012.
     * <p>
     * This represents the concept of the year, counting sequentially and using negative numbers.
     * The proleptic year is not interpreted in terms of the era.
     * See {@link #YEAR_OF_ERA} for an example showing the mapping from proleptic year to year-of-era.
     * <p>
     * The standard mental model for a date is based on three concepts - year, month and day.
     * These map onto the {@code YEAR}, {@code MONTH_OF_YEAR} and {@code DAY_OF_MONTH} fields.
     * Note that there is no reference to eras.
     * The full model for a date requires four concepts - era, year, month and day. These map onto
     * the {@code ERA}, {@code YEAR_OF_ERA}, {@code MONTH_OF_YEAR} and {@code DAY_OF_MONTH} fields.
     * Whether this field or {@code YEAR_OF_ERA} is used depends on which mental model is being used.
     * See {@link ChronoLocalDate} for more discussion on this topic.
     * <p>
     * Non-ISO calendar systems should implement this field as follows.
     * If the calendar system has only two eras, before and after a fixed date, then the
     * proleptic-year value must be the same as the year-of-era value for the later era,
     * and increasingly negative for the earlier era.
     * If the calendar system has more than two eras, then the proleptic-year value may be
     * defined with any appropriate value, although defining it to be the same as ISO may be
     * the best option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    PROLEPTIC_MONTH("ProlepticMonth", MONTHS, FOREVER, ValueRange.of(Year.MIN_VALUE * 12L, Year.MAX_VALUE * 12L + 11)),

    /**
     * The proleptic-month based, counting months sequentially from year 0.
     * <p>
     * This field is the sequential count of months where the first month
     * in proleptic-year zero has the value zero.
     * Later months have increasingly larger values.
     * Earlier months have increasingly small values.
     * There are no gaps or breaks in the sequence of months.
     * Note that this uses the <i>local</i> time-line, ignoring offset and time-zone.
     * <p>
     * In the default ISO calendar system, June 2012 would have the value
     * {@code (2012 * 12 + 6 - 1)}. This field is primarily for internal use.
     * <p>
     * Non-ISO calendar systems must implement this field as per the definition above.
     * It is just a simple zero-based count of elapsed months from the start of proleptic-year 0.
     * All calendar systems with a full proleptic-year definition will have a year zero.
     * If the calendar system has a minimum year that excludes year zero, then one must
     * be extrapolated in order for this method to be defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", WEEKS, YEARS, ValueRange.of(1, 53)),

    /**
     * The aligned week within a year.
     * <p>
     * This represents concept of the count of weeks within the period of a year
     * where the weeks are aligned to the start of the year.
     * This field is typically used with {@link #ALIGNED_DAY_OF_WEEK_IN_YEAR}.
     * <p>
     * For example, in a calendar systems with a seven day week, the first aligned-week-of-year
     * starts on day-of-year 1, the second aligned-week starts on day-of-year 8, and so on.
     * Thus, day-of-year values 1 to 7 are in aligned-week 1, while day-of-year values
     * 8 to 14 are in aligned-week 2, and so on.
     * <p>
     * Calendar systems that do not have a seven day week should typically implement this
     * field in the same way, but using the alternate week length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    EPOCH_DAY("EpochDay", DAYS, FOREVER, ValueRange.of((long) (Year.MIN_VALUE * 365.25), (long) (Year.MAX_VALUE * 365.25))),

    /**
     * The epoch-day, based on the Java epoch of 1970-01-01 (ISO).
     * <p>
     * This field is the sequential count of days where 1970-01-01 (ISO) is zero.
     * Note that this uses the <i>local</i> time-line, ignoring offset and time-zone.
     * <p>
     * This field is strictly defined to have the same meaning in all calendar systems.
     * This is necessary to ensure interoperation between calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    DAY_OF_MONTH("DayOfMonth", DAYS, MONTHS, ValueRange.of(1, 28, 31), "day"),

    /**
     * The day-of-month.
     * <p>
     * This represents the concept of the day within the month.
     * In the default ISO calendar system, this has values from 1 to 31 in most months.
     * April, June, September, November have days from 1 to 30, while February has days
     * from 1 to 28, or 29 in a leap year.
     * <p>
     * Non-ISO calendar systems should implement this field using the most recognized
     * day-of-month values for users of the calendar system.
     * Normally, this is a count of days from 1 to the length of the month.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", DAYS, WEEKS, ValueRange.of(1, 7)),

    /**
     * The aligned day-of-week within a month.
     * <p>
     * This represents concept of the count of days within the period of a week
     * where the weeks are aligned to the start of the month.
     * This field is typically used with {@link #ALIGNED_WEEK_OF_MONTH}.
     * <p>
     * For example, in a calendar systems with a seven day week, the first aligned-week-of-month
     * starts on day-of-month 1, the second aligned-week starts on day-of-month 8, and so on.
     * Within each of these aligned-weeks, the days are numbered from 1 to 7 and returned
     * as the value of this field.
     * As such, day-of-month 1 to 7 will have aligned-day-of-week values from 1 to 7.
     * And day-of-month 8 to 14 will repeat this with aligned-day-of-week values from 1 to 7.
     * <p>
     * Calendar systems that do not have a seven day week should typically implement this
     * field in the same way, but using the alternate week length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    AMPM_OF_DAY("AmPmOfDay", HALF_DAYS, DAYS, ValueRange.of(0, 1), "dayperiod"),

    /**
     * The am-pm-of-day.
     * <p>
     * This counts the AM/PM within the day, from 0 (AM) to 1 (PM).
     * This field has the same meaning for all calendar systems.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated from 0 to 1 in strict and smart mode.
     * In lenient mode the value is not validated. It is combined with
     * {@code HOUR_OF_AMPM} to form {@code HOUR_OF_DAY} by multiplying
     * the {AMPM_OF_DAY} value by 12.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    HOUR_OF_DAY("HourOfDay", HOURS, DAYS, ValueRange.of(0, 23), "hour"),

    /**
     * The hour-of-day.
     * <p>
     * This counts the hour within the day, from 0 to 23.
     * This is the hour that would be observed on a standard 24-hour digital clock.
     * This field has the same meaning for all calendar systems.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     * The field is combined with {@code MINUTE_OF_HOUR}, {@code SECOND_OF_MINUTE} and
     * {@code NANO_OF_SECOND} to produce a {@code LocalTime}.
     * In lenient mode, any excess days are added to the parsed date, or
     * made available via {@link java.time.format.DateTimeFormatter#parsedExcessDays()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    HOUR_OF_AMPM("HourOfAmPm", HOURS, HALF_DAYS, ValueRange.of(0, 11)),

    /**
     * The hour-of-am-pm.
     * <p>
     * This counts the hour within the AM/PM, from 0 to 11.
     * This is the hour that would be observed on a standard 12-hour digital clock.
     * This field has the same meaning for all calendar systems.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated from 0 to 11 in strict and smart mode.
     * In lenient mode the value is not validated. It is combined with
     * {@code AMPM_OF_DAY} to form {@code HOUR_OF_DAY} by multiplying
     * the {AMPM_OF_DAY} value by 12.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    MINUTE_OF_HOUR("MinuteOfHour", MINUTES, HOURS, ValueRange.of(0, 59), "minute"),

    /**
     * The minute-of-hour.
     * <p>
     * This counts the minute within the hour, from 0 to 59.
     * This field has the same meaning for all calendar systems.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    SECOND_OF_MINUTE("SecondOfMinute", SECONDS, MINUTES, ValueRange.of(0, 59), "second"),

    /**
     * The second-of-minute.
     * <p>
     * This counts the second within the minute, from 0 to 59.
     * This field has the same meaning for all calendar systems.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    MILLI_OF_SECOND("MilliOfSecond", MILLIS, SECONDS, ValueRange.of(0, 999)),

    /**
     * The milli-of-second.
     * <p>
     * This counts the millisecond within the second, from 0 to 999.
     * This field has the same meaning for all calendar systems.
     * <p>
     * This field is used to represent the milli-of-second handling any fraction of the second.
     * Implementations of {@code TemporalAccessor} should provide a value for this field if
     * they can return a value for {@link #SECOND_OF_MINUTE}, {@link #SECOND_OF_DAY} or
     * {@link #INSTANT_SECONDS} filling unknown precision with zero.
     * <p>
     * When this field is used for setting a value, it should behave in the same way as
     * setting {@link #NANO_OF_SECOND} with the value multiplied by 1,000,000.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     * The field is resolved in combination with {@code MICRO_OF_SECOND} to produce
     * {@code NANO_OF_SECOND}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    MICRO_OF_SECOND("MicroOfSecond", MICROS, SECONDS, ValueRange.of(0, 999_999)),

    /**
     * The micro-of-second.
     * <p>
     * This counts the microsecond within the second, from 0 to 999,999.
     * This field has the same meaning for all calendar systems.
     * <p>
     * This field is used to represent the micro-of-second handling any fraction of the second.
     * Implementations of {@code TemporalAccessor} should provide a value for this field if
     * they can return a value for {@link #SECOND_OF_MINUTE}, {@link #SECOND_OF_DAY} or
     * {@link #INSTANT_SECONDS} filling unknown precision with zero.
     * <p>
     * When this field is used for setting a value, it should behave in the same way as
     * setting {@link #NANO_OF_SECOND} with the value multiplied by 1,000.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     * The field is resolved in combination with {@code MILLI_OF_SECOND} to produce
     * {@code NANO_OF_SECOND}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
    NANO_OF_SECOND("NanoOfSecond", NANOS, SECONDS, ValueRange.of(0, 999_999_999)),

    /**
     * The nano-of-second.
     * <p>
     * This counts the nanosecond within the second, from 0 to 999,999,999.
     * This field has the same meaning for all calendar systems.
     * <p>
     * This field is used to represent the nano-of-second handling any fraction of the second.
     * Implementations of {@code TemporalAccessor} should provide a value for this field if
     * they can return a value for {@link #SECOND_OF_MINUTE}, {@link #SECOND_OF_DAY} or
     * {@link #INSTANT_SECONDS} filling unknown precision with zero.
     * <p>
     * When this field is used for setting a value, it should set as much precision as the
     * object stores, using integer division to remove excess precision.
     * For example, if the {@code TemporalAccessor} stores time to millisecond precision,
     * then the nano-of-second must be divided by 1,000,000 before replacing the milli-of-second.
     * <p>
     * When parsing this field it behaves equivalent to the following:
     * The value is validated in strict and smart mode but not in lenient mode.
     * The field is resolved in combination with {@code MILLI_OF_SECOND} and {@code MICRO_OF_SECOND}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoField.java
public enum ChronoField implements TemporalField {

/**
 * A standard set of fields.
 * <p>
 * This set of fields provide field-based access to manipulate a date, time or date-time.
 * The standard set of fields can be extended by implementing {@link TemporalField}.
 * <p>
 * These fields are intended to be applicable in multiple calendar systems.
 * For example, most non-ISO calendar systems define dates as a year, month and day,
 * just with slightly different rules.
 * The documentation of each field explains how it operates.
 *
 * @implSpec
 * This is a final, immutable and thread-safe enum.
 *
 * @since 1.8
 */