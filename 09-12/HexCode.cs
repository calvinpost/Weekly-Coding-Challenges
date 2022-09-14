using System;
using System.Text.RegularExpressions;

public class HexCode
{
    public static void Main(string[] args)
    {
        string[] codes = {
            "#CD5C5C",
            "#EAECEE",
            "#eaecee",
            "#CD5C58C",
            "#CD5C5Z",
            "#CD5C&C",
            "CD5C5C"
            };
        foreach (string code in codes) {
            Console.WriteLine(code + " : " + IsHexCode(code));
        }
    }
    
    public static bool IsHexCode(string s) {
        string p = "^#[0-9a-fA-F]+$";
        return Regex.IsMatch(s,p);
    }
}
