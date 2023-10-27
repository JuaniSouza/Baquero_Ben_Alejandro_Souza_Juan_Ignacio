package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);
    private List<Odontologo> odontolodoRepositorio;

    public OdontologoDaoMemoria(List<Odontologo> odontolodoRepositorio) {
        this.odontolodoRepositorio = odontolodoRepositorio;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {

        odontolodoRepositorio.add(odontologo);
        Odontologo odontologoGuardado = new Odontologo(odontologo.getNumeroMatricula(), odontologo.getNombre(),odontologo.getApellido());
        LOGGER.info("Odontologo guardado: " + odontologoGuardado);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        List<Odontologo> odontologos = new ArrayList<>();
        for(int i = 0; i<odontologos.size(); i++){
            System.out.println(odontologos.get(i));
        };
        LOGGER.info("Listado de odontologos obtenido: " + odontologos);
        return odontologos;
    }

}
