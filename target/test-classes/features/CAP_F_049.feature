Feature: CAP_F_049 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF049 - Cargando el Navegador

  @CAP_F_049
  Scenario Outline: Cargando la web
    When CAPF049 - Se haya cargado la web
    And CAPF049 - Aceptar las cookies
    And CAPF049 - Limpiar
    And CAPF049 - Buscar por palabras "<palabras>"
    And CAPF049 - Seleccionar Provincias "<provincias>"
    And CAPF049 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF049 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF049 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF049 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | bahía | none | none | none | none |
