Feature: CAP_F_068 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF068 - Cargando el Navegador

  @CAP_F_068
  Scenario Outline: Cargando la web
    When CAPF068 - Se haya cargado la web
    And CAPF068 - Aceptar las cookies
    And CAPF068 - Limpiar
    And CAPF068 - Buscar por palabras "<palabras>"
    And CAPF068 - Seleccionar Provincias "<provincias>"
    And CAPF068 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF068 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF068 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF068 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | ALMERÍA | MONUMENTO NATURAL | ENCINA DE LA PEANA | none |
