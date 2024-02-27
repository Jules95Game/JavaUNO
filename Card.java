import helpers.ansi.ConsoleColors;

public class Card {
  private ConsoleColors colors;

  private String value;

  public Card(String value, String color) {
    if (color.toLowerCase().equals("red")) {
      this.value = colors.redBackground(value);

    } else if (color.toLowerCase().equals("green")) {
      this.value = colors.greenBackground(value);

    } else if (color.toLowerCase().equals("blue")) {
      this.value = colors.blueBackground(value);

    } else if (color.toLowerCase().equals("yellow")) {
      this.value = colors.yellowBackground(value);

    } else if (color.toLowerCase().equals("wild")) {
      this.value = value;

    } else {
      this.value = "invalid card";
    }
  }

  public String getValue() {
    return value;
  }
}
