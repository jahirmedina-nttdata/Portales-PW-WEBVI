Feature: CAP_F_021 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF021 - Cargando el Navegador

  @CAP_F_021
  Scenario Outline: Cargando la web
    When CAPF021 - Se haya cargado la web
    And CAPF021 - Aceptar las cookies
    And CAPF021 - Limpiar
    And CAPF021 - Buscar por palabras "<palabras>"
    And CAPF021 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF021 - Seleccionar Provincias "<provincias>"
    And CAPF021 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF021 - Es Accesible "<accesible>"
    And CAPF021 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF021 - Buscar
    Examples:
      | palabras | tipo_espacio_natural | provincias | equipamento | accesible | nombre_espacio_natural |
      | none   | none    | ALMERÍA    | ÁREA RECREATIVA |no|none|
