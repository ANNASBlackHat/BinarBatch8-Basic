public class TableProperty {
    private String foregroundColor;
    private int textSize;
    private String textStyle;
    private String textColor;

    public TableProperty(String foregroundColor, int textSize, String textStyle, String textColor) {
        this.foregroundColor = foregroundColor;
        this.textSize = textSize;
        this.textStyle = textStyle;
        this.textColor = textColor;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
