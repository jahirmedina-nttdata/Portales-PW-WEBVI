Feature: CAP_F_073 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF073 - Cargando el Navegador

  @CAP_F_073
  Scenario Outline: Cargando la web
    When CAPF073 - Se haya cargado la web
    And CAPF073 - Aceptar las cookies
    And CAPF073 - Limpiar
    And CAPF073 - Buscar por palabras "<palabras>"
    And CAPF073 - Seleccionar Provincias "<provincias>"
    And CAPF073 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF073 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF073 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF073 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | zona | none | none | none | none |
