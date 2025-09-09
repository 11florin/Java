package model;

public abstract class LabEquipment {
    private static final int MIN_YEAR = 1950;
    private String manufacturer;
    private String model;
    private int year;

    public LabEquipment(String manufacurer, String model, int year) {
        setManufacurer(manufacurer);
        setModel(model);
        setYear(year);
    }
    public LabEquipment(LabEquipment source) {
        setManufacurer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }
    public abstract LabEquipment clone();
    
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacurer(String manufacurer) {
        if (manufacurer == null || manufacurer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank");
        }
        this.manufacturer = manufacurer;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year");
        }
        this.year = year;
    }
    public abstract String performMaintenance();

}
