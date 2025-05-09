package com.icaropaixao.helpdesk.services;

import com.icaropaixao.helpdesk.domain.Chamado;
import com.icaropaixao.helpdesk.domain.Cliente;
import com.icaropaixao.helpdesk.domain.Tecnico;
import com.icaropaixao.helpdesk.domain.enums.Perfil;
import com.icaropaixao.helpdesk.domain.enums.Prioridade;
import com.icaropaixao.helpdesk.domain.enums.Status;
import com.icaropaixao.helpdesk.repositories.ChamadoRepository;
import com.icaropaixao.helpdesk.repositories.ClienteRepository;
import com.icaropaixao.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instaciaDB(){
        //tecnico
        Tecnico tec1 = new Tecnico(null, "Ícaro Reis", "777","icaro@email","123");
        tec1.addPerfil(Perfil.ADMIN); // adicionando cargo ADMIN
        // cliente
        Cliente cli1 = new Cliente(null,"Linus Torvalds", "70411744013","torvalds@email","123");
        //chamado
        Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado",tec1,cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(chamado1));
    }

}
