Feature: CAP_F_041 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF041 - Cargando el Navegador

  @CAP_F_041
  Scenario Outline: Cargando la web
    When CAPF041 - Se haya cargado la web
    And CAPF041 - Aceptar las cookies
    And CAPF041 - Limpiar
    And CAPF041 - Buscar por palabras "<palabras>"
    And CAPF041 - Seleccionar Provincias "<provincias>"
    And CAPF041 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF041 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF041 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF041 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | ALMERÍA | none | none | ÁREA RECREATIVA |
