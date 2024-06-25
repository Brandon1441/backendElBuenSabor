package com.example.backendElBuenSabor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.backendElBuenSabor.entities.*;
import com.example.backendElBuenSabor.entities.enums.*;
import com.example.backendElBuenSabor.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@SpringBootApplication
public class BackendElBuenSabor {

	public static void main(String[] args) {
		SpringApplication.run(BackendElBuenSabor.class, args);
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("**************************************");
		System.out.println("*   Servidor iniciado correctamente. *");
		System.out.println("*     "+currentDateTime+"  *");
		System.out.println("***************************************");
	}

	@Bean
	@Transactional
	CommandLineRunner init(ImagenRepository imagenRepository,
						   UsuarioRepository usuarioRepository,
						   EmpleadoRepository empleadoRepository,
						   ClienteRepository clienteRepository,
						   PaisRepository paisRepository,
						   ProvinciaRepository provinciaRepository,
						   LocalidadRepository localidadRepository,
						   DomicilioRepository domicilioRepository,
						   EmpresaRepository empresaRepository,
						   SucursalRepository sucursalRepository,
						   PedidoRepository pedidoRepository,
						   DetallePedidoRepository detallePedidoRepository,
						   CategoriaRepository categoriaRepository,
						   PromocionRepository promocionRepository,
						   UnidadMedidaRepository unidadMedidaRepository,
						   ArticuloInsumoRepository articuloInsumoRepository,
						   ArticuloManuFacturadoRepository articuloManuFacturadoRepository,
						   ArticuloManuFacturadoDetalleRepository articuloManuFacturadoDetalleRepository,
						   PromocionDetalleRepository promocionDetalleRepository,
						   FacturaRepository facturaRepository){
		return args -> {


			Pais pais1 = Pais.builder()
					.nombre("Argentina")
					.build();
			paisRepository.save(pais1);



			Pais pais2 = Pais.builder()
					.nombre("Chile")
					.build();
			paisRepository.save(pais2);


			Provincia pro1 = Provincia.builder()
					.nombre("Mendoza")
					.pais(pais1)
					.build();
			provinciaRepository.save(pro1);


			Provincia pro2 = Provincia.builder()
					.nombre("Santiago")
					.pais(pais2)
					.build();
			provinciaRepository.save(pro2);


			Localidad loc1 = Localidad.builder()
					.nombre("Maipú")
					.provincia(pro1)
					.build();
			localidadRepository.save(loc1);


			Localidad loc2 = Localidad.builder()
					.nombre("Coquimbo")
					.provincia(pro2)
					.build();
			localidadRepository.save(loc2);


			Domicilio dom1 = Domicilio.builder()
					.calle("Los artesanos")
					.numero(4587)
					.cp(5515)
					.localidad(loc1)
					.build();
			domicilioRepository.save(dom1);

			Domicilio dom2 = Domicilio.builder()
					.calle("Paseo del sol")
					.numero(77885)
					.cp(8860000)
					.localidad(loc2)
					.build();
			domicilioRepository.save(dom2);

			Empresa empresa1 = Empresa.builder()
					.nombre("CHURRICO")
					.razonSocial("CHURRICO SH")
					.cuil(20270364)
					.build();
			empresaRepository.save(empresa1);

			Sucursal sucursal1 = Sucursal.builder()
					.nombre("Gaymallen - Churrico")
					.horarioApertura(LocalTime.of(8,30))
					.horarioCierre(LocalTime.of(21, 30))
					.casaMatriz(false)
					.domicilio(dom1)
					.empresa(empresa1)
					.build();
			sucursalRepository.save(sucursal1);

			Sucursal sucursal2 = Sucursal.builder()
					.nombre("Maipú CHURRICO")
					.horarioApertura(LocalTime.of(10,15))
					.horarioCierre(LocalTime.of(23, 45))
					.casaMatriz(true)
					.domicilio(dom2)
					.empresa(empresa1)
					.build();
			sucursalRepository.save(sucursal2);

			Imagen ima1 = Imagen.builder()
					.denominacion("First")
					.build();
			imagenRepository.save(ima1);

			Imagen ima2 = Imagen.builder()
					.denominacion("Second")
					.build();
			imagenRepository.save(ima2);



			Usuario usu1 = Usuario.builder()
					.auth0Id("!#43kejre%58")
					.userName("User1")
					.build();
			usuarioRepository.save(usu1);



			Usuario usu2 = Usuario.builder()
					.auth0Id("sdf###!4s")
					.userName("User1")
					.build();
			usuarioRepository.save(usu2);



			Empleado empleado1 = Empleado.builder()
					.rol(Rol.EMPLEADO)
					.imagenEmpleado(ima1)
					.usuarioEmpleado(usu1)
					.sucursal(sucursal1)
					.build();
			empleado1.setNombre("Juan Cruz");
			empleado1.setApellido("Navarro");
			empleado1.setTelefono("2615544787");
			empleado1.setEmail("juancruz.nav@outlook.com");
			empleado1.setFechaDeNacimiento(LocalDate.of(2002, 1, 28));
			empleadoRepository.save(empleado1);



			Cliente cliente1 = Cliente.builder()
					.domicilio(dom1)
					.imagenCliente(ima2)
					.usuarioCliente(usu2)
					.build();
			cliente1.setNombre("Miguel");
			cliente1.setApellido("Ramirez");
			cliente1.setTelefono("2617854875");
			cliente1.setEmail("ramirezmiguel@yahoo.com");
			cliente1.setFechaDeNacimiento(LocalDate.of(2001, 2, 14));
			clienteRepository.save(cliente1);



			Pedido ped1 = Pedido.builder()
					.horaEstimadaFinalizacion(LocalTime.of(02,12))
					.total(150.000)
					.totalCosto(75.000)
					.estado(Estado.ENTREGADO)
					.formaPago(FormaPago.MERCADOPAGO)
					.tipoEnvio(TipoEnvio.TAKEAWAY)
					.fechaPedido(LocalDate.of(2024,6,15))
					.cliente(cliente1)
					.empleado(empleado1)
					.sucursal(sucursal2)
					.domicilio(dom1)
					.build();
			pedidoRepository.save(ped1);




			Pedido ped2 = Pedido.builder()
					.horaEstimadaFinalizacion(LocalTime.of(2,30))
					.total(17.000)
					.totalCosto(10.000)
					.estado(Estado.PREPARACION)
					.formaPago(FormaPago.MERCADOPAGO)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.fechaPedido(LocalDate.of(2024,6,15))
					.cliente(cliente1)
					.empleado(empleado1)
					.sucursal(sucursal2)
					.domicilio(dom2)
					.build();
			pedidoRepository.save(ped2);



			DetallePedido detalle1 = DetallePedido.builder()
					.cantidad(7)
					.subTotal(400.5)
					.pedido(ped1)
					.build();
			detallePedidoRepository.save(detalle1);

			DetallePedido detalle2 = DetallePedido.builder()
					.cantidad(8)
					.subTotal(126.000)
					.pedido(ped2)
					.build();
			detallePedidoRepository.save(detalle2);



			Categoria cat1 = Categoria.builder()
					.denominacion("Panificados")
					.build();
			categoriaRepository.save(cat1);

			Categoria subCat1 = Categoria.builder()
					.denominacion("1 CAT SUB ")
					.categoriaPadre(cat1)
					.build();

			categoriaRepository.save(subCat1);


			Categoria subCat2 = Categoria.builder()
					.denominacion("2 CAT SUB")
					.categoriaPadre(cat1)
					.build();
			categoriaRepository.save(subCat2);

			Imagen imgProm1 = Imagen.builder()
					.denominacion("promo_1.png")
					.build();
			imagenRepository.save(imgProm1);
			Imagen imgProm2 = Imagen.builder()
					.denominacion("promo_2.png")
					.build();
			imagenRepository.save(imgProm2);


			Promocion prom1 = Promocion.builder()
					.denominacion("PROMO 1")
					.descripcionDescuento("25% de descuento")
					.fechaDesde(LocalDate.of(2024,4,1))
					.fechaHasta(LocalDate.of(2024, 7, 1))
					.horaDesde(LocalTime.of(1,0))
					.horaHasta(LocalTime.of(1,0))
					.precioDescuento(4500)
					.tipoPromocion(TipoPromocion.PROMOCION)
					.imagenPromocion(imgProm1)
					.build();
			promocionRepository.save(prom1);


			sucursal1.setPromocion(prom1);
			sucursalRepository.save(sucursal1);



			Promocion prom2 = Promocion.builder()
					.denominacion("PROMO 2")
					.descripcionDescuento("5% de descuento")
					.fechaDesde(LocalDate.of(2024,4,1))
					.fechaHasta(LocalDate.of(2024, 7, 1))
					.horaDesde(LocalTime.of(1,0))
					.horaHasta(LocalTime.of(1,0))
					.precioDescuento(4000)
					.tipoPromocion(TipoPromocion.PROMOCION)
					.imagenPromocion(imgProm2)
					.build();
			promocionRepository.save(prom2);



			sucursal2.setPromocion(prom2);
			sucursalRepository.save(sucursal2);


			UnidadMedida unMedida = UnidadMedida.builder()
					.denominacion("MEDIDA 1")
					.build();
			unidadMedidaRepository.save(unMedida);




			ArticuloInsumo artInsumo1 = ArticuloInsumo.builder()
					.precioCompra(460.5)
					.stockActual(360)
					.stockMaximo(1508)
					.esParaElaborar(Boolean.FALSE)
					.build();
			artInsumo1.setDenominacion("Insumo Churros");
			artInsumo1.setPrecioVenta(230.0);
			artInsumo1.setCategoria(cat1);
			artInsumo1.setUnidadMedida(unMedida);
			articuloInsumoRepository.save(artInsumo1);


			ArticuloManuFacturado artManuf1 = ArticuloManuFacturado.builder()
					.descripcion("MANUFACT 1 Churros dulce de leche")
					.tiempoEstimadoMinutos(35)
					.preparacion("MANUFACT 2")
					.build();
			artManuf1.setDenominacion("MANUFACT 1");
			artManuf1.setPrecioVenta(1500);
			artManuf1.setCategoria(cat1);
			artManuf1.setUnidadMedida(unMedida);
			articuloManuFacturadoRepository.save(artManuf1);



			ArticuloManuFacturadoDetalle artManufDet1 = ArticuloManuFacturadoDetalle.builder()
					.cantidad(5)
					.articuloInsumo(artInsumo1)
					.articuloManuFacturado(artManuf1)
					.build();
			articuloManuFacturadoDetalleRepository.save(artManufDet1);


			PromocionDetalle promDetalle1 = PromocionDetalle.builder()
					.cantidad(2)
					.articulo(artManuf1)
					.promocion(prom1)
					.build();
			promocionDetalleRepository.save(promDetalle1);


			Factura ft1 = Factura.builder()
					.fechaFacturacion(LocalDate.of(2024,6,20))
					.mpPaymentId(800537420)
					.mpMerchantOrderId(0247453)
					.mpPreferenceId("MP800537420")
					.mpPaymentType("Wallet")
					.formaPago(FormaPago.MERCADOPAGO)
					.totalVenta(20.000)
					.build();
			facturaRepository.save(ft1);
			pedidoRepository.save(ped1);



			Factura ft2 = Factura.builder()
					.fechaFacturacion(LocalDate.of(2024, 6, 22))
					.mpPaymentId(800537654)
					.mpMerchantOrderId(45673)
					.mpPreferenceId("MP800537654")
					.mpPaymentType("QR")
					.formaPago(FormaPago.MERCADOPAGO)
					.totalVenta(15.000)
					.build();
			facturaRepository.save(ft2);

			ped2.setFactura(ft2);
			pedidoRepository.save(ped2);

		};
	}
}
