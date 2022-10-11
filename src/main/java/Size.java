public enum Size {

    S(""),
    M(""),
    L(""),
    X("");
    private String size;
    private final String DESCRIPTION;

    Size(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return "Size{" +
                "size='" + size + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                '}';
    }
}
