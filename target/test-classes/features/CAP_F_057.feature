Feature: CAP_F_057 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF057 - Cargando el Navegador

  @CAP_F_057
  Scenario Outline: Cargando la web
    When CAPF057 - Se haya cargado la web
    And CAPF057 - Aceptar las cookies
    And CAPF057 - Limpiar
    And CAPF057 - Buscar por palabras "<palabras>"
    And CAPF057 - Seleccionar Provincias "<provincias>"
    And CAPF057 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF057 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF057 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF057 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | ALMERÍA | MONUMENTO NATURAL | ENCINA DE LA PEANA | none |
