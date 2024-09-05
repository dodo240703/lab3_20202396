package com.example.lab2_20202396.Controllers;


import com.example.lab2_20202396.Models.Auto;
import com.example.lab2_20202396.Models.Sede;
import com.example.lab2_20202396.Models.Seguro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/formCar")
    public String formCars(Model model){
        if (listaSedes.isEmpty()) {
            listaSedes.add(new Sede(1568, "Sede Central","sede central"));
            listaSedes.add(new Sede(2789, "Sede Sur","sede sur"));
        }
        model.addAttribute("sedes", listaSedes);
        return "formAuto";
    }
    @GetMapping("/formSedes")
    public String formSedes(){
        return "formSede";
    }
    @GetMapping("/formSecure")
    public String formSecure(){
        return "formSeguro";
    }
    @PostMapping("/registrarCarrito")
    public String registrarCarrito(Auto auto , Model model){
        listaAutos.add(auto);
        System.out.println("DATA BINDIIIIIING");

        // Pasamos la lista de estudiantes al modelo
        model.addAttribute("autos", listaAutos);
        return "autos";
    }
    @PostMapping("/registrarSede")
    public String registrarSede(Sede sede , Model model){
        listaSedes.add(sede);
        System.out.println("DATA BINDIIIIIING");

        // Pasamos la lista de estudiantes al modelo
        model.addAttribute("sedes", listaSedes);
        return "sedes";
    }
    @PostMapping("/registrarSeguro")
    public String registrarSeguro(Seguro seguro , Model model){
        listaSeguro.add(seguro);
        System.out.println("DATA BINDIIIIIING");

        // Pasamos la lista de estudiantes al modelo
        model.addAttribute("seguros", listaSeguro);
        return "seguros";
    }
}
