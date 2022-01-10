Feature: CAP_F_104 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF104 - Cargando el Navegador

  @CAP_F_104
  Scenario Outline: Cargando la web
    When CAPF104 - Se haya cargado la web
    And CAPF104 - Aceptar las cookies
    And CAPF104 - Limpiar
    And CAPF104 - Buscar por palabras "<palabras>"
    And CAPF104 - Seleccionar Provincias "<provincias>"
    And CAPF104 - Seleccionar Categorias "<categoria>"
    And CAPF104 - Seleccionar SubCategorias "<subcategoria>"
    And CAPF104 - Seleccionar Tipo de Archivo "<tipo_archivo>"
    And CAPF104 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF104 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF104 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF104 - Buscar
    Examples:
      | palabras | provincias | categoria | subcategoria | tipo_archivo | equipamento | tipo_espacio_natural | nombre_espacio_natural |
      | guía | none | none | none | none | none | none | none |
