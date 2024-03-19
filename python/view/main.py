import sys
from pathlib import Path

# Adiciona o diretório raiz ao sys.path
sys.path.append(str(Path(__file__).parent.parent))


from model.conta_bancaria import ContaBancaria


# Executável para testar a classe ContaBancaria
if __name__ == "__main__":
    conta1 = ContaBancaria()
    conta1.nome = "João"
    conta1.saldo = 1000
    conta1.limite = 500

    conta2 = ContaBancaria()
    conta2.nome = "Maria"

    # Transferindo 700 de conta1 para conta2
    valor_transferencia = 700
    if conta1.transfere(conta2, valor_transferencia):
        print(f"Transferência de {valor_transferencia} realizada com sucesso.")
    else:
        print(f"Saldo insuficiente para transferência de {valor_transferencia}.")

    print(f"Saldo de {conta1.nome}: {conta1.saldo}")
    print(f"Saldo de {conta2.nome}: {conta2.saldo}")
