package tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import sisrh.banco.Banco;
import sisrh.dto.Empregado;
import sisrh.rest.EmpregadoRest;

public class Teste {
	private EmpregadoRest er;
	private Banco b;
	
	@BeforeEach
    void setUp() {
        b = Mockito.mock(Banco.class);
        
	}

    @Test
    public void test1() throws SQLException {
    	
        assertEquals(1,1);
    }
}

	
	
	
	
