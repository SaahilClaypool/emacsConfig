_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp

////////////////////////////////////////////////////////////
/// \class sf::Color
/// \ingroup graphics
///
/// sf::Color is a simple color class composed of 4 components:
/// \li Red
/// \li Green
/// \li Blue
/// \li Alpha (opacity)
///
/// Each component is a public member, an unsigned integer in
/// the range [0, 255]. Thus, colors can be constructed and
/// manipulated very easily:
///
/// \code
/// sf::Color color(255, 0, 0); // red
/// color.r = 0;                // make it black
/// color.b = 128;              // make it dark blue
/// \endcode
///
/// The fourth component of colors, named "alpha", represents
/// the opacity of the color. A color with an alpha value of
/// 255 will be fully opaque, while an alpha value of 0 will
/// make a color fully transparent, whatever the value of the
/// other components is.
///
/// The most common colors are already defined as static variables:
/// \code
/// sf::Color black       = sf::Color::Black;
/// sf::Color white       = sf::Color::White;
/// sf::Color red         = sf::Color::Red;
/// sf::Color green       = sf::Color::Green;
/// sf::Color blue        = sf::Color::Blue;
/// sf::Color yellow      = sf::Color::Yellow;
/// sf::Color magenta     = sf::Color::Magenta;
/// sf::Color cyan        = sf::Color::Cyan;
/// sf::Color transparent = sf::Color::Transparent;
/// \endcode
///
/// Colors can also be added and modulated (multiplied) using the
/// overloaded operators + and *.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API Color& operator *=(Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the binary *= operator
///
/// This operator returns the component-wise multiplication
/// (also called "modulation") of two colors, and assigns
/// the result to the left operand.
/// Components are then divided by 255 so that the result is
/// still in the range [0, 255].
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API Color& operator +=(Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the binary += operator
///
/// This operator computes the component-wise sum of two colors,
/// and assigns the result to the left operand.
/// Components that exceed 255 are clamped to 255.
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API Color operator *(const Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the binary * operator
///
/// This operator returns the component-wise multiplication
/// (also called "modulation") of two colors.
/// Components are then divided by 255 so that the result is
/// still in the range [0, 255].
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return Result of \a left * \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API Color operator +(const Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the binary + operator
///
/// This operator returns the component-wise sum of two colors.
/// Components that exceed 255 are clamped to 255.
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return Result of \a left + \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API bool operator !=(const Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the != operator
///
/// This operator compares two colors and check if they are different.
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return True if colors are different, false if they are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
SFML_GRAPHICS_API bool operator ==(const Color& left, const Color& right);

////////////////////////////////////////////////////////////
/// \relates Color
/// \brief Overload of the == operator
///
/// This operator compares two colors and check if they are equal.
///
/// \param left  Left operand
/// \param right Right operand
///
/// \return True if colors are equal, false if they are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
};

    ////////////////////////////////////////////////////////////
    Uint8 r; ///< Red component
    Uint8 g; ///< Green component
    Uint8 b; ///< Blue component
    Uint8 a; ///< Alpha (opacity) component
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
    ////////////////////////////////////////////////////////////

    static const Color Black;       ///< Black predefined color
    static const Color White;       ///< White predefined color
    static const Color Red;         ///< Red predefined color
    static const Color Green;       ///< Green predefined color
    static const Color Blue;        ///< Blue predefined color
    static const Color Yellow;      ///< Yellow predefined color
    static const Color Magenta;     ///< Magenta predefined color
    static const Color Cyan;        ///< Cyan predefined color
    static const Color Transparent; ///< Transparent (black) predefined color
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
    Color(Uint8 red, Uint8 green, Uint8 blue, Uint8 alpha = 255);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the color from its 4 RGBA components
    ///
    /// \param red   Red component (in the range [0, 255])
    /// \param green Green component (in the range [0, 255])
    /// \param blue  Blue component (in the range [0, 255])
    /// \param alpha Alpha (opacity) component (in the range [0, 255])
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
    Color();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructs an opaque black color. It is equivalent to
    /// sf::Color(0, 0, 0, 255).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
class SFML_GRAPHICS_API Color

////////////////////////////////////////////////////////////
/// \brief Utility class for manpulating RGBA colors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
#ifndef SFML_COLOR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Color.hpp
//

////////////////////////////////////////////////////////////