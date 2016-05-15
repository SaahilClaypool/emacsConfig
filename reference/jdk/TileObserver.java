_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/TileObserver.java
    public void tileUpdate(WritableRenderedImage source,
                           int tileX, int tileY,
                           boolean willBeWritable);

  /**
    * A tile is about to be updated (it is either about to be grabbed
    * for writing, or it is being released from writing).
    *
    * @param source the image that owns the tile.
    * @param tileX the X index of the tile that is being updated.
    * @param tileY the Y index of the tile that is being updated.
    * @param willBeWritable  If true, the tile will be grabbed for writing;
    *                        otherwise it is being released.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/TileObserver.java
public interface TileObserver {

/**
  * An interface for objects that wish to be informed when tiles
  * of a WritableRenderedImage become modifiable by some writer via
  * a call to getWritableTile, and when they become unmodifiable via
  * the last call to releaseWritableTile.
  *
  * @see WritableRenderedImage
  *
  * @author Thomas DeWeese
  * @author Daniel Rice
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/TileObserver.java
    public void tileUpdate(WritableRenderedImage source,
                           int tileX, int tileY,
                           boolean willBeWritable);

  /**
    * A tile is about to be updated (it is either about to be grabbed
    * for writing, or it is being released from writing).
    *
    * @param source the image that owns the tile.
    * @param tileX the X index of the tile that is being updated.
    * @param tileY the Y index of the tile that is being updated.
    * @param willBeWritable  If true, the tile will be grabbed for writing;
    *                        otherwise it is being released.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/TileObserver.java
public interface TileObserver {

/**
  * An interface for objects that wish to be informed when tiles
  * of a WritableRenderedImage become modifiable by some writer via
  * a call to getWritableTile, and when they become unmodifiable via
  * the last call to releaseWritableTile.
  *
  * @see WritableRenderedImage
  *
  * @author Thomas DeWeese
  * @author Daniel Rice
  */