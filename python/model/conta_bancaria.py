class ContaBancaria:
    def __init__(self, numero=0, nome="", saldo=0.0, limite=0.0):
        self._numero = numero
        self._nome = nome
        self._saldo = saldo
        self._limite = limite

    def saca(self, valor):
        if valor <= (self._saldo + self._limite):
            self._saldo -= valor
            return True
        else:
            return False

    def deposita(self, valor):
        self._saldo += valor
        print(f"Depositado {valor}")

    def transfere(self, destino, valor):
        if self.saca(valor):
            destino.deposita(valor)
            print(f"Transferido {valor} para a conta de {destino.nome}")
            return True
        else:
            return False

    @property
    def numero(self):
        return self._numero

    @numero.setter
    def numero(self, numero):
        self._numero = numero

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    @property
    def saldo(self):
        return self._saldo

    @saldo.setter
    def saldo(self, saldo):
        self._saldo = saldo

    @property
    def limite(self):
        return self._limite

    @limite.setter
    def limite(self, limite):
        self._limite = limite
