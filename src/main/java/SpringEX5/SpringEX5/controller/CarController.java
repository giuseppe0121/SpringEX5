package SpringEX5.SpringEX5.controller;
import SpringEX5.SpringEX5.DTO.CarDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    List<CarDTO> listCar = new ArrayList<>();



    /*@GetMapping("/")
    public CarDTO getCar(@RequestParam String id,@RequestParam String modelName,@RequestParam(required = false) double price){
        CarDTO car = new CarDTO(id,modelName,price);
        return car;
    }

     */

    @GetMapping("/")
    public List<CarDTO> getCarList(){

        return listCar;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void postCar(@RequestBody CarDTO carDTO){

        listCar.add(carDTO);
        System.out.println("un auto è stata creata");

    }

}
