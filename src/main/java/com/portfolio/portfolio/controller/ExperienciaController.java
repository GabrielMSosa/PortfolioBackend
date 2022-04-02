/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Educacion;
import com.portfolio.portfolio.model.Experiencias;
import com.portfolio.portfolio.model.Idioma;
import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.service.IserviExpe;
import com.portfolio.portfolio.serviceEdu.IServiceEdu;
import com.portfolio.portfolio.serviceIdioma.IServiceIdioma;
import com.portfolio.portfolio.serviceSkill.IServiSkill;
import com.portfolio.portfolio.serviceusers.IServiceUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class ExperienciaController {
    @Autowired
    private IserviExpe servi;
    
    @Autowired
    private IServiceUser serviUser;
 
    @Autowired 
    private IServiceEdu serviEdu;
    
    @Autowired
    private IServiceIdioma serviIdio;
    
    @Autowired
    private IServiSkill serviSkil;
    
     //------------- INICIO ENDPOINT USERS-----------------------------------
    
 @CrossOrigin(origins = "http://localhost:4200")
 @PostMapping("/user")
 public void CargarnuevoUser(@RequestBody User dato ){
 
 serviUser.crearExpe(dato);
 
 
 }   
 
 @CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/user/traertodo")
public List<User> traerTodoUser(){
    System.out.println("llamaron al get!");
    return serviUser.traerTodo();

}


@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/user/borrar/{id}")    
 public void deleteUser(@PathVariable Long id){
 serviUser.borrarExpe(id);
 
 }
 
    
     //------------- FIN ENDPOINT USERS-----------------------------------
    
    
    //------------- INICIO ENDPOINT EXPERIENCIAS-----------------------------------
 @CrossOrigin(origins = "http://localhost:4200")
 @PostMapping("/experiencias")
 public void Cargarnuevo(@RequestBody Experiencias dato ){
 
 servi.crearExpe(dato);
 
 
 }
    
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/experiencias/traertodo")
public List<Experiencias> traerTodo(){
    System.out.println("llamaron al get!");
return servi.traerTodo();

}
    @CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/experiencias/borrar/{id}")    
 public void deleteexp(@PathVariable Long id){
 servi.borrarExpe(id);
 
 }
 
 
 @CrossOrigin(origins = "http://localhost:4200")
@PutMapping("/experiencias/editar/{id}")
 public void editarExp(@PathVariable Long id,
                       @RequestParam String ntrabajo,
                       @RequestParam String nempresa,
                       @RequestParam String ndeltaanio,
                        @RequestParam Long nfechaFin,
                        @RequestParam Long nfechaIni,
                        @RequestParam String nprovincias,
                        @RequestParam String nuriImg,
                        @RequestParam String npais,
                        @RequestParam String nlocalidad
            ){
 
 Experiencias x= servi.traerPorId(id);
 x.setTrabajo(ntrabajo);
 x.setEmpresa(nempresa);
 x.setDeltaanio(ndeltaanio);
 x.setFechaFin(nfechaFin);
 x.setFechaIni(nfechaIni);
 x.setProvincias(nprovincias);
 x.setUriImg(nuriImg);
 x.setPais(npais);
 x.setLocalidad(nlocalidad);
 
 servi.crearExpe(x);
 
 
 
 }
 
 
 
 
 
 
 
 //------------- FIN DE ENDPOINT EXPERIENCIAS-----------------------------------
    
//-------------------------------------------------------------------------------    
//------------- INICIO ENDPOINT IDIOMA-----------------------------------

@CrossOrigin(origins = "http://localhost:4200")
 @PostMapping("/idioma")
 public void CargarEdu(@RequestBody Idioma dato ){
 
serviIdio.crearIdio(dato);
 
 
 }
    
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/idioma/traertodo")
public List<Idioma> traerTodoIdio(){
    System.out.println("llamaron al get!");
return serviIdio.traerTodo();

}
    @CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/idioma/borrar/{id}")    
 public void deleteIdio(@PathVariable Long id){
 serviIdio.borrarIdiom(id);
 
 }
 
 
 @CrossOrigin(origins = "http://localhost:4200")
@PutMapping("/idioma/editar/{id}")
 public void editarIdio(@PathVariable Long id,
                       @RequestParam String nidioma,
                       @RequestParam String nnivel_lectura,
                       @RequestParam String nnivel_escritura
            ){
 
 Idioma x= serviIdio.traerPorId(id);
 x.setNivel_escritura(nnivel_escritura);
 x.setNivel_lectura(nnivel_lectura);
 x.setIdioma(nidioma);
 x.setId(id);
 
 serviIdio.crearIdio(x);
 
 
 }
 //------------- FIN ENDPOINT IDIOMA-----------------------------------
 
 //-------------------------------------------------------------------------------    
//------------- INICIO ENDPOINT EDUCACION-----------------------------------

 @CrossOrigin(origins = "http://localhost:4200")
 @PostMapping("/educacion")
 public void CargarEdu(@RequestBody Educacion dato ){
 
 serviEdu.crearEdu(dato);
 
 
 }
    
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/educacion/traertodo")
public List<Educacion> traerTodoEdu(){
    System.out.println("llamaron al get!");
return serviEdu.traerTodo();

}
    @CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/educacion/borrar/{id}")    
 public void deleteEdu(@PathVariable Long id){
 serviEdu.borrarEdu(id);
 
 }
 
 
 @CrossOrigin(origins = "http://localhost:4200")
@PutMapping("/educacion/editar/{id}")
 public void editarEdu(@PathVariable Long id,
                        @RequestParam String ninstitucion,
                        @RequestParam String ntitulo,
                        @RequestParam String nfechaIni,
                        @RequestParam String nfechaFin,
                        @RequestParam String nestado,
                        @RequestParam String nuriImg
            ){
 
 Educacion x= serviEdu.traerPorId(id);
 x.setInstitucion(ninstitucion);
x.setTitulo(ntitulo);
x.setFechaIni(nfechaIni);
x.setFechaFin(nfechaFin);
x.setEstado(nestado);
x.setUriImg(nuriImg);
 serviEdu.crearEdu(x);
 
 
 }


//------------- FIN ENDPOINT EDUCACION-----------------------------------
 
 //-------------------------------------------------------------------------------    

//-------------------------------------------------------------------------------    
//------------- INICIO ENDPOINT SKILLS-----------------------------------

@CrossOrigin(origins = "http://localhost:4200")
 @PostMapping("/skill")
 public void Cargarskill(@RequestBody Skills dato ){
 
serviSkil.crearSkill(dato);
 
 
 }
    
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/skill/traertodo")
public List<Skills> traerTodoSkills(){
    System.out.println("llamaron al get!");
return serviSkil.traerTodo();

}
    @CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/skill/borrar/{id}")    
 public void deleteSkill(@PathVariable Long id){
 serviSkil.borrarSkill(id);
 
 }
 
 
 @CrossOrigin(origins = "http://localhost:4200")
@PutMapping("/skill/editar/{id}")
 public void editarSkill(@PathVariable Long id,
                      @RequestParam String nlenguaje,
                      @RequestParam String ninfo,
                      @RequestParam String nnivel,
                      @RequestParam String nurlImg
            ){
 
 Skills x= serviSkil.traerPorId(id);
 x.setInfo(ninfo);
 x.setLenguaje(nlenguaje);
 x.setNivel(nnivel);
 x.setId(id);
 x.setUrlImg(nurlImg);
 serviSkil.crearSkill(x);
 
 
 }






 
 
 
 
 
}
