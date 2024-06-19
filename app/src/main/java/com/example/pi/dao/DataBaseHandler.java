package com.example.pi.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.pi.model.ClienteVO;

public final class DataBaseHandler extends SQLiteOpenHelper {
    private static final String DATABASENAME = "Banco DB";
    private static final int VERSION = 1;

    public DataBaseHandler(@Nullable Context context, @Nullable SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASENAME, factory, VERSION);
    }

    @Override
    public void onCreate(@Nullable SQLiteDatabase db) {
        final SQLiteDatabase dbLocal = db != null ? db : getWritableDatabase();

        final String createTableLogin =
                "CREATE TABLE IF NOT EXISTS " + DadosLogin.getTbLogin() + " (" +
                        DadosLogin.getId() + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        DadosLogin.getCliente() + " TEXT, " +
                        DadosLogin.getSenha() + " TEXT)";
        ;

        final String createTableClientes =
                "CREATE TABLE IF NOT EXISTS " + DadosCliente.getTbClientes() + " (" +
                        DadosCliente.getKeyId() + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        DadosCliente.getIdCliente() + " INTEGER " +
                        DadosCliente.getNome() + " TEXT, " +
                        DadosCliente.getEndereco() + " TEXT, " +
                        DadosCliente.getEmail() + " TEXT, " +
                        DadosCliente.getDdd() + " TEXT, " +
                        DadosCliente.getTelefone() + " TEXT, " +
                        DadosCliente.getFoto() + " BLOB, " +
                        DadosCliente.getCpf() + " TEXT " +
                        " FOREIGN KEY (" + DadosCliente.getIdCliente() + ") REFERENCES " + DadosLogin.getTbLogin() + "(" + DadosLogin.getId() + ")) ";

        dbLocal.execSQL(createTableClientes);

        final String createTableContas =
                "CREATE TABLE IF NOT EXISTS " + DadosConta.getTbConta() + " (" +
                        DadosConta.getKeyId() + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        DadosConta.getConta() + " INTEGER, " +
                        DadosConta.getAgencia() + " TEXT, " +
                        DadosConta.getSaldo() + " INTEGER, " +
                        DadosConta.getCredito() + " TEXT, " +
                        " FOREIGN KEY (" + DadosConta.getConta() + ") REFERENCES " + DadosCliente.getTbClientes() + "(" + DadosCliente.getKeyId() + ")) ";

        dbLocal.execSQL(createTableContas);

        final String createTableHistoricos =
                "CREATE TABLE IF NOT EXISTS " + DadosHistorico.getTbHistorico() + " (" +
                        DadosHistorico.getKeyId() + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        DadosHistorico.getConta() + " INTEGER, " +
                        DadosHistorico.getNome() + " TEXT, " +
                        DadosHistorico.getTipo() + " TEXT, " +
                        DadosHistorico.getValor() + " INTEGER)";

        dbLocal.execSQL(createTableHistoricos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.deleteTable();
        this.onCreate(db);
    }

    private void deleteTable() {
        final SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + DadosCliente.getTbClientes());
        db.execSQL("DROP TABLE IF EXISTS " + DadosConta.getTbConta());
        db.execSQL("DROP TABLE IF EXISTS " + DadosHistorico.getTbHistorico());
    }

    public void insereCliente(ClienteVO cliente) {

    }

    public void getCliente(int id) {

    }
}