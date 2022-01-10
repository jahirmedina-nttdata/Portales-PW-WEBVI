Feature: CAP_F_026 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF026 - Cargando el Navegador

  @CAP_F_026
  Scenario Outline: Cargando la web
    When CAPF026 - Se haya cargado la web
    And CAPF026 - Aceptar las cookies
    And CAPF026 - Limpiar
    And CAPF026 - Buscar por palabras "<palabras>"
    And CAPF026 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF026 - Seleccionar Provincias "<provincias>"
    And CAPF026 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF026 - Es Accesible "<accesible>"
    And CAPF026 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF026 - Buscar
    Examples:
      | palabras | tipo_espacio_natural | provincias | equipamento | accesible | nombre_espacio_natural |
      | none   | LUGAR DE IMPORTANCIA COMUNITARIA    | none    | none |no|DUNAS DEL ODIEL|
