import java.util.ArrayList;
import java.util.List;

public class RoundToMillionMain {
    public static void main(String[] args) {

        City city1 = new City("Nice", "942208");
        City city2 = new City("Abu Dhabi", "1482816");
        City city3 = new City("Naples", "21886853");
        City city4 = new City("Vatican City", "572");
        List<City> cityList = new ArrayList<>();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        System.out.println(cityList);
        System.out.println(roundToMillion(cityList));
    }

    public static List<City> roundToMillion(List<City> cityList){

        List<City> newList = new ArrayList<>();
        for(City city : cityList){
            int population = Integer.parseInt(city.population());
            if(population < 500000){
                newList.add(new City(city.cityName(), "0"));
            }
            else{
                int rounded = (int)Math.round(population/1000000.0) * 1000000;
                newList.add(new City(city.cityName(),String.valueOf(rounded) ));
            }
        }
        return newList;
    }
}

