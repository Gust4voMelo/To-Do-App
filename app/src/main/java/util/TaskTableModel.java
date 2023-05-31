/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author gusta
 */
public class TaskTableModel extends AbstractTableModel{

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();
    
    //Diz quantas linhas a tabela vai ter
    @Override
    public int getRowCount() {
        return tasks.size();
    }

    //Diz quantas colunas tem
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    //Retorna a informação de uma linha e uma coluna especifica
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            //Retorna o nome da tarefa com base na linha
            case 1:
                return tasks.get(rowIndex).getName();
            
            //Retorna a descrição
            case 2:
                return tasks.get(rowIndex).getDescription();
            
            //Retorna o prazo 
            case 3:
                return tasks.get(rowIndex).getDeadline();
                
            //Retorna se a tarefa está concluida    
            case 4: 
                return tasks.get(rowIndex).isIsCompleted();
                              
            case 5:
                return "";
                         
            case 6:
                return "";
            
            default:
                return "Dados não encontrados";
        }
    }
    
}
