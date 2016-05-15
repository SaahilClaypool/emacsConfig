_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp

////////////////////////////////////////////////////////////
/// \class sf::Font
/// \ingroup graphics
///
/// Fonts can be loaded from a file, from memory or from a custom
/// stream, and supports the most common types of fonts. See
/// the loadFromFile function for the complete list of supported formats.
///
/// Once it is loaded, a sf::Font instance provides three
/// types of information about the font:
/// \li Global metrics, such as the line spacing
/// \li Per-glyph metrics, such as bounding box or kerning
/// \li Pixel representation of glyphs
///
/// Fonts alone are not very useful: they hold the font data
/// but cannot make anything useful of it. To do so you need to
/// use the sf::Text class, which is able to properly output text
/// with several options such as character size, style, color,
/// position, rotation, etc.
/// This separation allows more flexibility and better performances:
/// indeed a sf::Font is a heavy resource, and any operation on it
/// is slow (often too slow for real-time applications). On the other
/// side, a sf::Text is a lightweight object which can combine the
/// glyphs data and metrics of a sf::Font to display any text on a
/// render target.
/// Note that it is also possible to bind several sf::Text instances
/// to the same sf::Font.
///
/// It is important to note that the sf::Text instance doesn't
/// copy the font that it uses, it only keeps a reference to it.
/// Thus, a sf::Font must not be destructed while it is
/// used by a sf::Text (i.e. never write a function that
/// uses a local sf::Font instance for creating a text).
///
/// Usage example:
/// \code
/// // Declare a new font
/// sf::Font font;
/// 
/// // Load it from a file
/// if (!font.loadFromFile("arial.ttf"))
/// {
///     // error...
/// }
/// 
/// // Create a text which uses our font
/// sf::Text text1;
/// text1.setFont(font);
/// text1.setCharacterSize(30);
/// text1.setStyle(sf::Text::Regular);
/// 
/// // Create another text using the same font, but with different parameters
/// sf::Text text2;
/// text2.setFont(font);
/// text2.setCharacterSize(50);
/// text1.setStyle(sf::Text::Italic);
/// \endcode
///
/// Apart from loading font files, and passing them to instances
/// of sf::Text, you should normally not have to deal directly
/// with this class. However, it may be useful to access the
/// font metrics or rasterized glyphs for advanced usage.
///
/// \see sf::Text
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
};

    ////////////////////////////////////////////////////////////
    void*                      m_library;     ///< Pointer to the internal library interface (it is typeless to avoid exposing implementation details)
    void*                      m_face;        ///< Pointer to the internal font face (it is typeless to avoid exposing implementation details)
    void*                      m_streamRec;   ///< Pointer to the stream rec instance (it is typeless to avoid exposing implementation details)
    int*                       m_refCount;    ///< Reference counter used by implicit sharing
    mutable PageTable          m_pages;       ///< Table containing the glyphs pages by character size
    mutable std::vector<Uint8> m_pixelBuffer; ///< Pixel buffer holding a glyph's pixels before being written to the texture
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    ////////////////////////////////////////////////////////////

    typedef std::map<unsigned int, Page> PageTable; ///< Table mapping a character size to its page (texture)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    bool setCurrentSize(unsigned int characterSize) const;

    ////////////////////////////////////////////////////////////
    /// \brief Make sure that the given size is the current one
    ///
    /// \param characterSize Reference character size
    ///
    /// \return True on success, false if any error happened
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    IntRect findGlyphRect(Page& page, unsigned int width, unsigned int height) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a suitable rectangle within the texture for a glyph
    ///
    /// \param page   Page of glyphs to search in
    /// \param width  Width of the rectangle
    /// \param height Height of the rectangle
    ///
    /// \return Found rectangle within the texture
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    Glyph loadGlyph(Uint32 codePoint, unsigned int characterSize, bool bold) const;

    ////////////////////////////////////////////////////////////
    /// \brief Load a new glyph and store it in the cache
    ///
    /// \param codePoint     Unicode code point of the character to load
    /// \param characterSize Reference character size
    /// \param bold          Retrieve the bold version or the regular one?
    ///
    /// \return The glyph corresponding to \a codePoint and \a characterSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Free all the internal resources
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    };

        GlyphTable       glyphs;  ///< Table mapping code points to their corresponding glyph
        sf::Texture      texture; ///< Texture containing the pixels of the glyphs
        unsigned int     nextRow; ///< Y position of the next new row in the texture
        std::vector<Row> rows;    ///< List containing the position of all the existing rows
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    struct Page

    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    ////////////////////////////////////////////////////////////

    typedef std::map<Uint32, Glyph> GlyphTable; ///< Table mapping a codepoint to its glyph
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    };

        unsigned int width;  ///< Current width of the row
        unsigned int top;    ///< Y position of the row into the texture
        unsigned int height; ///< Height of the row
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    struct Row

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a row of glyphs
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    Font& operator =(const Font& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    const Texture& getTexture(unsigned int characterSize) const;

    ////////////////////////////////////////////////////////////
    /// \brief Retrieve the texture containing the loaded glyphs of a certain size
    ///
    /// The contents of the returned texture changes as more glyphs
    /// are requested, thus it is not very relevant. It is mainly
    /// used internally by sf::Text.
    ///
    /// \param characterSize Reference character size
    ///
    /// \return Texture containing the glyphs of the requested size
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    int getLineSpacing(unsigned int characterSize) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the line spacing
    ///
    /// Line spacing is the vertical offset to apply between two
    /// consecutive lines of text.
    ///
    /// \param characterSize Reference character size
    ///
    /// \return Line spacing, in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    int getKerning(Uint32 first, Uint32 second, unsigned int characterSize) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the kerning offset of two glyphs
    ///
    /// The kerning is an extra offset (negative) to apply between two
    /// glyphs when rendering them, to make the pair look more "natural".
    /// For example, the pair "AV" have a special kerning to make them
    /// closer than other characters. Most of the glyphs pairs have a
    /// kerning offset of zero, though.
    ///
    /// \param first         Unicode code point of the first character
    /// \param second        Unicode code point of the second character
    /// \param characterSize Reference character size
    ///
    /// \return Kerning value for \a first and \a second, in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    const Glyph& getGlyph(Uint32 codePoint, unsigned int characterSize, bool bold) const;

    ////////////////////////////////////////////////////////////
    /// \brief Retrieve a glyph of the font
    ///
    /// \param codePoint     Unicode code point of the character to get
    /// \param characterSize Reference character size
    /// \param bold          Retrieve the bold version or the regular one?
    ///
    /// \return The glyph corresponding to \a codePoint and \a characterSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    bool loadFromStream(InputStream& stream);

    ////////////////////////////////////////////////////////////
    /// \brief Load the font from a custom stream
    ///
    /// The supported font formats are: TrueType, Type 1, CFF,
    /// OpenType, SFNT, X11 PCF, Windows FNT, BDF, PFR and Type 42.
    /// Warning: SFML cannot preload all the font data in this
    /// function, so the contents of \a stream have to remain
    /// valid as long as the font is used.
    ///
    /// \param stream Source stream to read from
    ///
    /// \return True if loading succeeded, false if it failed
    ///
    /// \see loadFromFile, loadFromMemory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    bool loadFromMemory(const void* data, std::size_t sizeInBytes);

    ////////////////////////////////////////////////////////////
    /// \brief Load the font from a file in memory
    ///
    /// The supported font formats are: TrueType, Type 1, CFF,
    /// OpenType, SFNT, X11 PCF, Windows FNT, BDF, PFR and Type 42.
    /// Warning: SFML cannot preload all the font data in this
    /// function, so the buffer pointed by \a data has to remain
    /// valid as long as the font is used.
    ///
    /// \param data        Pointer to the file data in memory
    /// \param sizeInBytes Size of the data to load, in bytes
    ///
    /// \return True if loading succeeded, false if it failed
    ///
    /// \see loadFromFile, loadFromStream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    bool loadFromFile(const std::string& filename);

    ////////////////////////////////////////////////////////////
    /// \brief Load the font from a file
    ///
    /// The supported font formats are: TrueType, Type 1, CFF,
    /// OpenType, SFNT, X11 PCF, Windows FNT, BDF, PFR and Type 42.
    /// Note that this function know nothing about the standard
    /// fonts installed on the user's system, thus you can't
    /// load them directly.
    ///
    /// \param filename Path of the font file to load
    ///
    /// \return True if loading succeeded, false if it failed
    ///
    /// \see loadFromMemory, loadFromStream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    ~Font();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Cleans up all the internal resources used by the font
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    Font(const Font& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
    Font();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor defines an empty font
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
class SFML_GRAPHICS_API Font

////////////////////////////////////////////////////////////
/// \brief Class for loading and manipulating character fonts
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
#ifndef SFML_FONT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Font.hpp
//

////////////////////////////////////////////////////////////