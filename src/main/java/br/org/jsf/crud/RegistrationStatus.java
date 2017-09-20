package br.org.jsf.crud;

import static br.org.verify.Verify.isEmptyOrNull;
import static br.org.verify.Verify.isNotNull;

/**
 * <p>
 * Representa as possíveis situações cadastrais
 * de um registro no sistema.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @version v1.0.1 17/09/2017
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
   
   public static boolean isActive(RegistrationStatus registrationStatus) {
      if (isNotNull(registrationStatus) && ACTIVE.equals(registrationStatus)) {
         return true;
      }
      return false;
   }
   
   public static boolean active(RegistrationStatus registrationStatus) {
      return isActive(registrationStatus);
   }
   
   public static boolean isActive(String registrationStatus) {
      RegistrationStatus active = RegistrationStatus.valueOf(registrationStatus);
      if (isNotNull(active) && active.equals(ACTIVE)) {
         return true;
      }
      return false;
   }
   
   public static boolean active(String registrationStatus) {
      return isActive(registrationStatus);
   }
   
   public static boolean isInactive(RegistrationStatus registrationStatus) {
      if (isNotNull(registrationStatus) && INACTIVE.equals(registrationStatus)) {
         return true;
      }
      return false;
   }
   
   public static boolean inactive(RegistrationStatus registrationStatus) {
      return isInactive(registrationStatus);
   }
   
   public static boolean isInactive(String registrationStatus) {
      RegistrationStatus inactive = RegistrationStatus.valueOf(registrationStatus);
      if (isNotNull(inactive) && inactive.equals(INACTIVE)) {
         return true;
      }
      return false;
   }
   
   public static boolean inactive(String registrationStatus) {
      return isInactive(registrationStatus);
   }
   
   public static RegistrationStatus registrationStatus(String status) {
      RegistrationStatus RegistrationStatus = null;
      if (isEmptyOrNull(status)) {
         throw new IllegalArgumentException("ATENÇÃO: A situação não pode ser nula ou vazia!");
      } else {
         if (isActive(status)) {
            RegistrationStatus = ACTIVE;
         }
         if (isInactive(status)) {
            RegistrationStatus = INACTIVE;
         }
      }
      return RegistrationStatus;
   }
   
   public static RegistrationStatus status(String status) {
      return registrationStatus(status);
   }
   
   @Override
   public String toString() {
      return value;
   }
   
}
