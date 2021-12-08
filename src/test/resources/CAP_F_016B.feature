Feature: CAP_F_016B - Buscar Contenido en la Web de Portales (Buscador Imagenes)
  As un usuario comun
  I quiero buscar contenido en la web de imagenes
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF016B - Cargando el Navegador

  @CAP_F_016B
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF016B - Se haya cargado la web
    And CAPF016B - Aceptar las cookies
    And CAPF016B - Escribir "<txtBusqueda>" y Buscar
    And CAPF016B - Abrir Busqueda Avanzada
    And CAPF016B - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF016B - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF016B - Retomar Busqueda
#    And CAPF016B - Abrir Busqueda Avanzada
    And CAPF016B - Seleccionar Tema : "<numero>"
    And CAPF016B - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |