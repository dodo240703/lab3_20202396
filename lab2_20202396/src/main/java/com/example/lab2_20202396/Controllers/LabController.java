package com.example.lab2_20202396.Controllers;


import com.example.lab2_20202396.Models.Auto;
import com.example.lab2_20202396.Models.Sede;
import com.example.lab2_20202396.Models.Seguro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/dodo")
public class LabController {

    private ArrayList<Auto> listaAutos = new ArrayList<>();
    private ArrayList<Sede> listaSedes = new ArrayList<>();
    private ArrayList<Seguro> listaSeguro = new ArrayList<Seguro>();

    @GetMapping("/cars")
    public String showCars(){
        return "autos";
    }
    @GetMapping("/sedes")
    public String showSedes(){
        return "sedes";
    }
    @GetMapping("/secure")
    public String showSecures(){
        return "seguros";
    }
}
