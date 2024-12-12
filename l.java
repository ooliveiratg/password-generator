package lições.pastaLiçaoMurilo;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class l {
    private static AbstractButton seuBotao;

    public static void main(String[] args) {
        String comeco;
        double numeroR;
        int escolha;

        numeroR = Math.random()*1000;

        String[] opcao = {"ok","gerar nova senha"};

            // JOptionPane.showMessageDialog(null,"bem vindo ao gerador de senhas\n");

            // escolha = JOptionPane.showInputDialog((null),"sua senha é: " + (int)numeroR + "\nsim \nnão");
            
        

           

           while(true){
            numeroR = Math.random()*1000;
            escolha = JOptionPane.showOptionDialog(null,"sua senha é: " + (int)numeroR,"gerador de senhas",JOptionPane.YES_OPTION,JOptionPane.DEFAULT_OPTION,null, opcao, opcao[0]);

            if(Integer.toString(escolha) == opcao[1]){
              
                JOptionPane.showOptionDialog(null,"sua senha é: " + (int)numeroR,"gerador de senhas",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opcao, opcao[0]);
             break;   
            }else{
            if(escolha == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"sua senha é: " + (int)numeroR);
                break;
           }
           

            // while(true){
            //     if(escolha == Integer.int("sim")){
            //         break;
            //     }
            // }


          










    }
}
}
}