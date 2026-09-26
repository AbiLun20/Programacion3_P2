@PostMapping("/validarAcceso")
public Map<String, Object> validarAcceso(@RequestBody JsonNode entrada) {
    int edad = entrada.get("edad").asInt();
    double montoCambio = entrada.get("montoCambio").asDouble(); // Se cambia 'pago' por 'montoCambio'
    return eventoService.validarAcceso(edad, montoCambio);
}

public interface Evento Service {
    Map<String, Object>
    validar Acceso(int edad, double montoCambio);
}
