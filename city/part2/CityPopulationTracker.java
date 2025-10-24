package city.part2;

import java.util.HashMap;

public class CityPopulationTracker {
    
    private HashMap<String, City> cityPopulation;

    public CityPopulationTracker() {
        this.cityPopulation = new HashMap<>();
    }
    public City getCity(String cityName) {
        return new City(this.cityPopulation.get(cityName));
    }
    public void setCity(City city) {
        this.cityPopulation.put(city.getName(), new City(city));
    }
    public void addCity(City city) {
        this.cityPopulation.put(city.getName(), new City(city));
    }
}
