/*
 * Copyright 2009-2015 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.data;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import org.primefaces.showcase.domain.Car;
import org.primefaces.showcase.service.CarService;

@Named
@ViewScoped
//@SessionScoped
public class DataListView implements Serializable {

    private List<Car> cars1;

    private List<Car> cars2;

//    private List<Car> cars3;

    private Car selectedCar;

    @Inject
    private CarService carService;

    @PostConstruct
    public void init() {
        cars1 = carService.createCars(10);
        cars2 = carService.createCars(50);
//        cars3 = service.createCars(50);
    }

    public List<Car> getCars1() {
        return cars1;
    }

    public List<Car> getCars2() {
        return cars2;
    }

//    public List<Car> getCars3() {
//        return cars3;
//    }

//    public void setCarService(CarService carService) {
//        this.carService = carService;
//    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}
