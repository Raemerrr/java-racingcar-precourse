package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();
    private final MovingStrategy movingStrategy = new RandomNumberMovingStrategy();

    public Cars(final List<CarName> carNames) {
        for (final CarName name : carNames) {
            this.cars.add(new Car(name));
        }
    }

    public PlayResult play() {
        List<CarDTO> result = new ArrayList<>();
        for (final Car car : cars) {
            car.racing(movingStrategy);
            result.add(new CarDTO(car.getName().getValue(), car.getDistance().intValue()));
        }
        return new PlayResult(result);
    }
}
