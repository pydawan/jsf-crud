package br.org.jsf.crud;

import static br.org.verify.Verify.isNotNull;

/**
 * <p>
 * Representa as possíveis situações cadastrais
 * de um registro no sistema.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @version v1.0.0 17/09/2017
 * @since v1.0.0
 */
public enum SituacaoCadastro {
   
   ATIVO("Ativo", "ATIVO"), 
   INATIVO("Inativo", "INATIVO");
      
   private final String nome;
   private final String valor;
   
   private SituacaoCadastro(final String nome, final String valor) {
      this.nome = nome;
      this.valor = valor;
   }
   
   public String getNome() {
      return nome;
   }
   
   public String getValor() {
      return valor;
   }
   
   public String nome() {
      return getNome();
   }
   
   public String valor() {
      return getValor();
   }
   
   public static boolean isAtivo(SituacaoCadastro situacaoCadastro) {
      if (isNotNull(situacaoCadastro) && ATIVO.equals(situacaoCadastro)) {
         return true;
      }
      return false;
   }
   
   public static boolean ativo(SituacaoCadastro situacaoCadastro) {
      return isAtivo(situacaoCadastro);
   }
   
   public static boolean isAtivo(String situacaoCadastro) {
      SituacaoCadastro ativo = SituacaoCadastro.valueOf(situacaoCadastro);
      if (isNotNull(ativo) && ativo.equals(ATIVO)) {
         return true;
      }
      return false;
   }
   
   public static boolean ativo(String situacaoCadastro) {
      return isAtivo(situacaoCadastro);
   }
   
   public static boolean isInativo(SituacaoCadastro situacaoCadastro) {
      if (isNotNull(situacaoCadastro) && INATIVO.equals(situacaoCadastro)) {
         return true;
      }
      return false;
   }
   
   public static boolean inativo(SituacaoCadastro situacaoCadastro) {
      return isInativo(situacaoCadastro);
   }
   
   public static boolean isInativo(String situacaoCadastro) {
      SituacaoCadastro inativo = SituacaoCadastro.valueOf(situacaoCadastro);
      if (isNotNull(inativo) && inativo.equals(INATIVO)) {
         return true;
      }
      return false;
   }
   
   public static boolean inativo(String situacaoCadastro) {
      return isInativo(situacaoCadastro);
   }
   
   @Override
   public String toString() {
      return valor;
   }
   
}
