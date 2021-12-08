Feature: CAP_F_101 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF101 - Cargando el Navegador

  @CAP_F_101
  Scenario Outline: Cargando la web
    When CAPF101 - Se haya cargado la web
    And CAPF101 - Aceptar las cookies
    And CAPF101 - Limpiar
    And CAPF101 - Buscar por palabras "<palabras>"
    And CAPF101 - Seleccionar Provincias "<provincias>"
    And CAPF101 - Seleccionar Categorias "<categoria>"
    And CAPF101 - Seleccionar SubCategorias "<subcategoria>"
    And CAPF101 - Seleccionar Tipo de Archivo "<tipo_archivo>"
    And CAPF101 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF101 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF101 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF101 - Buscar
    Examples:
      | palabras | provincias | categoria | subcategoria | tipo_archivo | equipamento | tipo_espacio_natural | nombre_espacio_natural |
      | none | ALMERÍA | GUÍAS | none | PDF | none | MONUMENTO NATURAL | none |
