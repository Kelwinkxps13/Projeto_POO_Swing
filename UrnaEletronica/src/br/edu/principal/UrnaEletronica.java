/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.principal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Elbston Filho
 */
public class UrnaEletronica extends JFrame {
    private int Chapa10voto = 0;
    private int Chapa20voto = 0;
    
    private JLabel labelchapa10;
    private JLabel labelchapa20;
    
    public UrnaEletronica() {
        super("Urna Eletrônica");

        // Configuração do layout
        setLayout(new GridLayout(3, 2));

        // Componentes da interface
        labelchapa10 = new JLabel("Candidato 1: 0 votos");
        labelchapa20 = new JLabel("Candidato 2: 0 votos");

        JButton botaochapa10 = new JButton("Votar Candidato 1");
        JButton botaochapa20 = new JButton("Votar Candidato 2");

        // Adicionando componentes ao layout
        add(labelchapa10);
        add(labelchapa20);
        add(botaochapa10);
        add(botaochapa20);

        // Configuração dos ouvintes de eventos
        botaochapa10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chapa10voto++;
                atualizarLabels();
            }
        });

        botaochapa20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chapa20voto++;
                atualizarLabels();
            }
        });

        // Configurações da janela
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    private void atualizarLabels() {
        labelchapa10.setText("Candidato 1: " + Chapa10voto + " votos");
        labelchapa20.setText("Candidato 2: " + Chapa20voto + " votos");
    }
}
