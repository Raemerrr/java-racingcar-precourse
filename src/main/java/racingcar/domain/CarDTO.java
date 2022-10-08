package racingcar.domain;

public class CarDTO {
    private final String name;
    private final int distance;

    public CarDTO(final String name, final int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
