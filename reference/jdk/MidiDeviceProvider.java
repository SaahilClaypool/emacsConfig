_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiDeviceProvider.java
    public abstract MidiDevice getDevice(MidiDevice.Info info);

    /**
     * Obtains an instance of the device represented by the info object.
     *
     * @param  info an info object that describes the desired device
     * @return device instance
     * @throws IllegalArgumentException if the info object specified does not
     *         match the info object for a device supported by this
     *         {@code MidiDeviceProvider}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiDeviceProvider.java
    public abstract MidiDevice.Info[] getDeviceInfo();

    /**
     * Obtains the set of info objects representing the device or devices
     * provided by this {@code MidiDeviceProvider}.
     *
     * @return set of device info objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiDeviceProvider.java
    public boolean isDeviceSupported(MidiDevice.Info info) {

    /**
     * Indicates whether the device provider supports the device represented by
     * the specified device info object.
     *
     * @param  info an info object that describes the device for which support
     *         is queried
     * @return {@code true} if the specified device is supported, otherwise
     *         {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiDeviceProvider.java
public abstract class MidiDeviceProvider {

/**
 * A {@code MidiDeviceProvider} is a factory or provider for a particular type
 * of MIDI device. This mechanism allows the implementation to determine how
 * resources are managed in the creation and management of a device.
 *
 * @author Kara Kytle
 */
