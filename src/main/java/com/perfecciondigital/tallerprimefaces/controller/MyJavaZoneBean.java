package com.perfecciondigital.tallerprimefaces.controller;


import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mjzBean")
@SessionScoped

public class MyJavaZoneBean implements Serializable{

	private ArrayList visitantes;
	 
	 public void cargarListado(){
	  visitantes=new ArrayList();
	  
	  Visitantes v1=new Visitantes();
	  v1.setNombre("Pedro");
	  v1.setApellido("Perez");
	  v1.setEdad("18");
	  v1.setPais("Colombia");
	  
	  Visitantes v2=new Visitantes();
	  v2.setNombre("Pablo");
	  v2.setApellido("Rodriguez");
	  v2.setEdad("22");
	  v2.setPais("España");
	  
	  Visitantes v3=new Visitantes();
	  v3.setNombre("Marcos");
	  v3.setApellido("Velazquez");
	  v3.setEdad("22");
	  v3.setPais("México");
	  
	  Visitantes v4=new Visitantes();
	  v4.setNombre("Carlos");
	  v4.setApellido("Rodriguez");
	  v4.setEdad("22");
	  v4.setPais("México");
	  
	  Visitantes v5=new Visitantes();
	  v5.setNombre("Leslie");
	  v5.setApellido("Mon");
	  v5.setEdad("23");
	  v5.setPais("México");
	  
	  Visitantes v6=new Visitantes();
	  v6.setNombre("Juan");
	  v6.setApellido("carlos");
	  v6.setEdad("23");
	  v6.setPais("México");
	  
	  Visitantes v7=new Visitantes();
	  v7.setNombre("Adil");
	  v7.setApellido("Gomez");
	  v7.setEdad("32");
	  v7.setPais("México");
	  
	  Visitantes v8=new Visitantes();
	  v8.setNombre("Andre");
	  v8.setApellido("Morales");
	  v8.setEdad("22");
	  v8.setPais("México");
	  
	  Visitantes v9=new Visitantes();
	  v9.setNombre("Juan");
	  v9.setApellido("Perez");
	  v9.setEdad("22");
	  v9.setPais("México");
	  
	  Visitantes v10=new Visitantes();
	  v10.setNombre("Carlos");
	  v10.setApellido("Perez");
	  v10.setEdad("25");
	  v10.setPais("México");
	  
	  Visitantes v11=new Visitantes();
	  v11.setNombre("Pedro");
	  v11.setApellido("Perez");
	  v11.setEdad("18");
	  v11.setPais("Colombia");
	  
	  Visitantes v12=new Visitantes();
	  v12.setNombre("Pablo");
	  v12.setApellido("Rodriguez");
	  v12.setEdad("22");
	  v12.setPais("España");
	  
	  Visitantes v13=new Visitantes();
	  v13.setNombre("Marcos");
	  v13.setApellido("Velazquez");
	  v13.setEdad("22");
	  v13.setPais("México");
	  
	  Visitantes v14=new Visitantes();
	  v14.setNombre("Carlos");
	  v14.setApellido("Rodriguez");
	  v14.setEdad("22");
	  v14.setPais("México");
	  
	  Visitantes v15=new Visitantes();
	  v15.setNombre("Leslie");
	  v15.setApellido("Mon");
	  v15.setEdad("23");
	  v15.setPais("México");
	  
	  Visitantes v16=new Visitantes();
	  v16.setNombre("Juan");
	  v16.setApellido("carlos");
	  v16.setEdad("23");
	  v16.setPais("México");
	  
	  Visitantes v17=new Visitantes();
	  v17.setNombre("Adil");
	  v17.setApellido("Gomez");
	  v17.setEdad("32");
	  v17.setPais("México");
	  
	  Visitantes v18=new Visitantes();
	  v18.setNombre("Andre");
	  v18.setApellido("Morales");
	  v18.setEdad("22");
	  v18.setPais("México");
	  
	  Visitantes v19=new Visitantes();
	  v19.setNombre("Juan");
	  v19.setApellido("Perez");
	  v19.setEdad("22");
	  v19.setPais("México");
	  
	  Visitantes v20=new Visitantes();
	  v20.setNombre("Carlos");
	  v20.setApellido("Perez");
	  v20.setEdad("25");
	  v20.setPais("México");
	  
	  
	  visitantes.add(v1);
	  visitantes.add(v2);
	  visitantes.add(v3);
	  visitantes.add(v4);
	  visitantes.add(v5);
	  visitantes.add(v6);
	  visitantes.add(v7);
	  visitantes.add(v8);
	  visitantes.add(v9);
	  visitantes.add(v10);
	  visitantes.add(v11);
	  visitantes.add(v12);
	  visitantes.add(v13);
	  visitantes.add(v14);
	  visitantes.add(v15);
	  visitantes.add(v16);
	  visitantes.add(v17);
	  visitantes.add(v18);
	  visitantes.add(v19);
	  visitantes.add(v20);
	 }

	 public ArrayList getVisitantes() {
	  return visitantes;
	 }

	 public void setVisitantes(ArrayList visitantes) {
	  this.visitantes = visitantes;
	 }
	
	
}
