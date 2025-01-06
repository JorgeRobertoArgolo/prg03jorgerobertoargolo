/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.util;

/**
 * Classe utilitária para manipulação e validação de strings.
 * 
 * Esta classe fornece uma coleção de métodos estáticos para realizar 
 * operações e validações comuns em strings, como verificar valores nulos 
 * ou vazios, validar formatos e garantir conformidade com regras específicas
 */
public class StringUtil {
    // Verifica se uma string está nula ou vazia
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Valida se uma string contém apenas letras
    public static boolean isOnlyLetters(String str) {
        return str != null && str.matches("[a-zA-Z]+");
    }

    // Valida se uma string contém apenas números
    public static boolean isOnlyNumbers(String str) {
        return str != null && str.matches("\\d+");
    }

    // Valida se uma string contém apenas letras e números
    public static boolean isAlphanumeric(String str) {
        return str != null && str.matches("[a-zA-Z0-9]+");
    }

    // Valida se uma string contém apenas letras, números e espaços
    public static boolean isAlphanumericWithSpaces(String str) {
        return str != null && str.matches("[a-zA-Z0-9 ]+");
    }

    // Valida se uma string contém caracteres especiais
    public static boolean containsSpecialCharacters(String str) {
        return str != null && str.matches(".*[^a-zA-Z0-9 ].*");
    }

    // Valida se uma string é um e-mail válido
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) return false;
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    // Valida se uma string é um número de telefone válido (exemplo genérico)
    public static boolean isValidPhoneNumber(String phone) {
        if (isNullOrEmpty(phone)) return false;
        String phoneRegex = "\\+?\\d{1,3}?[-.\\s]?\\(?\\d{1,4}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}";
        return phone.matches(phoneRegex);
    }

    // Valida se uma string é uma URL válida
    public static boolean isValidURL(String url) {
        if (isNullOrEmpty(url)) return false;
        String urlRegex = "^(https?|ftp)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\S*)?$";
        return url.matches(urlRegex);
    }

    // Verifica se uma string está dentro de um tamanho mínimo e máximo
    public static boolean hasValidLength(String str, int min, int max) {
        if (str == null) return false;
        int length = str.length();
        return length >= min && length <= max;
    }

    // Remove espaços extras de uma string
    public static String trimExtraSpaces(String str) {
        if (str == null) return null;
        return str.trim().replaceAll("\\s+", " ");
    }

    // Converte uma string para camelCase
    public static String toCamelCase(String str) {
        if (isNullOrEmpty(str)) return str;
        String[] words = str.toLowerCase().split("\\s+");
        StringBuilder camelCaseString = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            camelCaseString.append(Character.toUpperCase(words[i].charAt(0)))
                           .append(words[i].substring(1));
        }
        return camelCaseString.toString();
    }

    // Verifica se uma string contém apenas caracteres maiúsculos
    public static boolean isUpperCase(String str) {
        return str != null && str.matches("[A-Z]+");
    }

    // Verifica se uma string contém apenas caracteres minúsculos
    public static boolean isLowerCase(String str) {
        return str != null && str.matches("[a-z]+");
    }

    // Verifica se uma string contém pelo menos uma letra maiúscula
    public static boolean containsUpperCase(String str) {
        return str != null && str.matches(".*[A-Z].*");
    }

    // Verifica se uma string contém pelo menos uma letra minúscula
    public static boolean containsLowerCase(String str) {
        return str != null && str.matches(".*[a-z].*");
    }

    // Verifica se uma string contém pelo menos um número
    public static boolean containsNumber(String str) {
        return str != null && str.matches(".*\\d.*");
    }

    // Verifica se uma string contém pelo menos um caractere especial
    public static boolean containsSpecialCharacter(String str) {
        return str != null && str.matches(".*[^a-zA-Z0-9].*");
    }

    // Valida se uma string é um CPF válido (simplificado)
    public static boolean isValidCPF(String cpf) {
        if (isNullOrEmpty(cpf)) return false;
        String cpfRegex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(cpfRegex);
    }

    // Valida se uma string é um CNPJ válido (simplificado)
    public static boolean isValidCNPJ(String cnpj) {
        if (isNullOrEmpty(cnpj)) return false;
        String cnpjRegex = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";
        return cnpj.matches(cnpjRegex);
    }

    // Valida se uma string corresponde a uma data no formato "dd/MM/yyyy"
    public static boolean isValidDate(String date) {
        if (isNullOrEmpty(date)) return false;
        String dateRegex = "\\d{2}/\\d{2}/\\d{4}";
        return date.matches(dateRegex);
    }
}
