Feature: CAP_F_012 - Buscar Contenido en la Web de Portales (Buscador Generico)
  As un usuario comun
  I quiero buscar contenido en la web principal
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF012 - Cargando el Navegador

  @CAP_F_012
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF012 - Se haya cargado la web
    And CAPF012 - Aceptar las cookies
    And CAPF012 - Escribir "<txtBusqueda>" y Buscar
    And CAPF012 - Abrir Busqueda Avanzada
    And CAPF012 - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF012 - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF012 - Retomar Busqueda
#    And CAPF012 - Abrir Busqueda Avanzada
    And CAPF012 - Seleccionar Tema Ambiental : "<numero>"
    And CAPF012 - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |

