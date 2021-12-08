Feature: CAP_F_034 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF034 - Cargando el Navegador

  @CAP_F_034
  Scenario Outline: Cargando la web
    When CAPF034 - Se haya cargado la web
    And CAPF034 - Aceptar las cookies
    And CAPF034 - Limpiar
    And CAPF034 - Buscar por palabras "<palabras>"
    And CAPF034 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF034 - Seleccionar Provincias "<provincias>"
    And CAPF034 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF034 - Es Accesible "<accesible>"
    And CAPF034 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF034 - Buscar
    Examples:
      | palabras | tipo_espacio_natural | provincias | equipamento | accesible | nombre_espacio_natural |
      | bahia   | none    | none    | none |no|none|
