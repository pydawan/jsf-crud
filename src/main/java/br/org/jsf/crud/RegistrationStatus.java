package br.org.jsf.crud;

/**
 * <p>
 * Representa as possíveis situações cadastrais
 * de um registro no sistema.
 * </p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public enum RegistrationStatus {
   
   ACTIVE("Ativo", "ATIVO"), 
   INACTIVE("Inativo", "INATIVO");
   
   private final String label;
   private final String value;
   
   private RegistrationStatus(final String label, final String value) {
      this.label = label;
      this.value = value;
   }
   
   public String getLabel() {
      return label;
   }
   
   public String getValue() {
      return value;
   }
   
   public String label() {
      return label;
   }
   
   public String value() {
      return value;
   }
   
   @Override
   public String toString() {
      return value;
   }
   
}
