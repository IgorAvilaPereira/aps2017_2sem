/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    
    public Pessoa(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (this.validaCpf(cpf)){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("digito 1 deu xabum");
        }       
    }

    public boolean validaCpf(String cpf) {
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            //Object get = lst.get(i);            
//        }        
//        
        char v[] = cpf.toCharArray();
        int soma = 0;
        // primeiro digito
        for (int i = 0, j = 10; i < 9; i++, j--) {
            //System.out.println("i:"+);
            //int elemento = v[i];            
            //soma+= j * Integer.parseInt(String.valueOf(v[i]));
            soma+= j * Character.getNumericValue(v[i]);
            //soma+= j * elemento;
        }
        //System.out.println("Soma:"+soma);
        int resto = soma % 11;
        //System.out.println("Resto:"+resto);
        if (resto < 2){            
            
            if (Character.getNumericValue(v[9]) !=  0){
                //System.out.println("oi");
                //throw new IllegalArgumentException("digito 1 deu xabum");
                return false;
            }            
        }
        else if (11 - resto != Character.getNumericValue(v[9])){
            //System.out.println(Integer.parseInt(String.valueOf(v[9])));
            //System.out.println(11 - resto);
            //throw new IllegalArgumentException("digito 1 deu xabum");
            return false;
        } 
        
        
        soma = 0;
        // segundo digito
        for (int i = 0, j = 11; i < 10; i++, j--) {
            //System.out.println("i:"+);
            //soma+= j * Integer.parseInt(String.valueOf(v[i]));
            soma+= j * Character.getNumericValue(v[i]);
        }
       // System.out.println("Soma2:"+soma);
        resto = soma % 11;
        //System.out.println("Resto2:"+resto);
        if (resto < 2){                        
            if (Character.getNumericValue(v[10]) !=  0){
               // System.out.println("oi");
                //throw new IllegalArgumentException("digito 2 deu xabum");
                return false;
            }            
        }
        else if (11 - resto != Character.getNumericValue(v[10])){
           // System.out.println(Integer.parseInt(String.valueOf(v[10])));
           // System.out.println(11 - resto);
            //throw new IllegalArgumentException("digito 2 deu xabum");
            return false;
        }   
        
        return true;
            
    }
    
    
    public String getCpfComMascara(){
        return this.cpf.substring(0, 3) + "." + 
               this.cpf.substring(3, 6) + "." +  
               this.cpf.substring(6, 9) + "-" + 
               this.cpf.substring(9, 11);
    }
    
    
    
    
    
}
