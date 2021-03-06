package lesson11_enums_oop.enums;

// Using enum to Create Your Own Data Types
// Enums are used to standardize some values

/*enum is basically a custom variable type
which has a limited set of possible values.
To define an enum, you use the enum keyword
(usually modified by public) followed by a list of possible
values enclosed in brackets:
* */

public class EnumTest
{

    public static void main(String[] args)
    {
        System.out.println(LengthUnit.CENTIMETER.getValue());
        System.out.println(WeatherType.RAINY);

        LengthUnit[] lengthUnits = LengthUnit.values();
        for (LengthUnit lengthUnit : lengthUnits)
        {

            System.out.println(lengthUnit);
        }
    }
}
