package gm.zona_fit_swing.gui;

import gm.zona_fit_swing.servicio.ClienteServicio;
import gm.zona_fit_swing.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    IClienteServicio clienteServicio;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
    }
}
