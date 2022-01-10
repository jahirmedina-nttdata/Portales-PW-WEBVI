Feature: CAP_F_090 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF090 - Cargando el Navegador

  @CAP_F_090
  Scenario Outline: Cargando la web
    When CAPF090 - Se haya cargado la web
    And CAPF090 - Aceptar las cookies
    And CAPF090 - Limpiar
    And CAPF090 - Buscar por palabras "<palabras>"
    And CAPF090 - Seleccionar Provincias "<provincias>"
    And CAPF090 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF090 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF090 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF090 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | Andalucía | CÁDIZ | none | none | CENTRO DE VISITANTES |
